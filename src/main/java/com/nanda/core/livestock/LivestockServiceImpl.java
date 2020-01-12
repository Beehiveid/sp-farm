package com.nanda.core.livestock;

import com.nanda.core.base.BaseService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class LivestockServiceImpl extends BaseService<LivestockRepository, Livestock, Long> implements LivestockService {
    public void register(Livestock livestock) {
        LivestockType livestockType = LivestockType.get(livestock.getType());

        if(livestockType == null)
            throw new RuntimeException("This type is not valid");

        if(!livestockType.isBig())
            livestock.setName(livestock.getBatch());
        else{
            if(livestock.getAmount() > 1)
                throw new RuntimeException("Big livestock register one entity per animal");

            String name = String.format("%s-%d", livestockType.getName().toLowerCase(), new Date().toInstant().toEpochMilli());
            livestock.setName(name);
        }

        livestock.setBig(livestockType.isBig());
        this.save(livestock);
    }
}

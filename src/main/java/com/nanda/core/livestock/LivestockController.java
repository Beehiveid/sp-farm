package com.nanda.core.livestock;

import com.nanda.core.base.BaseController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livestock")
public class LivestockController extends BaseController<LivestockServiceImpl, Livestock, Long> {
    @Override
    public void create(@RequestBody Livestock livestock) {
        service.register(livestock);
    }
}

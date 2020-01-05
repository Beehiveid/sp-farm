package com.nanda.core.livestock;

import com.nanda.core.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class LivestockServiceImpl extends BaseService<LivestockRepository, Livestock, Long> implements LivestockService {
}

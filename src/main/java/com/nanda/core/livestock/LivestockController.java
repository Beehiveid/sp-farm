package com.nanda.core.livestock;

import com.nanda.core.base.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livestock")
public class LivestockController extends BaseController<LivestockServiceImpl, Livestock, Long> {
}

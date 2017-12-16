package com.nanda.core.tester;

import com.nanda.core.base.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tester")
public class TesterController extends BaseController<TesterService, Tester, Long, TesterRepository> {
}

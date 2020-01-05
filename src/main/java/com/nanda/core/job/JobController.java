package com.nanda.core.job;

import com.nanda.core.base.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job")
public class JobController extends BaseController<JobServiceImpl, Job, Long> {
}

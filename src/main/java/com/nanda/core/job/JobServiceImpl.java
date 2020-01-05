package com.nanda.core.job;

import com.nanda.core.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImpl extends BaseService<JobRepository, Job, Long> implements JobService {
}

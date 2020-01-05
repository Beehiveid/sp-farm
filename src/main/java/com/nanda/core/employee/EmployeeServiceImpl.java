package com.nanda.core.employee;

import com.nanda.core.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends BaseService<EmployeeRepository, Employee, Long> implements EmployeeService {
}

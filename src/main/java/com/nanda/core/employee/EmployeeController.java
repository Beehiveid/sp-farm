package com.nanda.core.employee;

import com.nanda.core.base.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController extends BaseController<EmployeeServiceImpl, Employee, Long> {
}

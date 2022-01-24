package com.shubham.spring.dependencyinjection.controller;

import com.shubham.spring.dependencyinjection.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {

  @Autowired
    @Qualifier("jalandharEmployeeServiceImpl")
  EmployeeService employeeService;

    @GetMapping("/employee")
    public  void getName() throws InterruptedException {

        employeeService.getAddress();
        employeeService.getSalary();
        employeeService.getEmployee();
    }
}
package com.shubham.spring.dependencyinjection.service;

import org.springframework.stereotype.Service;

@Service
public class PhagwaraEmployeeServiceImpl implements EmployeeService {

    @Override
    public void getAddress() {
        System.out.println("Address is:" + "Urban Estate Phagwara!");
    }

    @Override
    public void getSalary() {
        System.out.println("THe salary: " + "100000");
    }
}

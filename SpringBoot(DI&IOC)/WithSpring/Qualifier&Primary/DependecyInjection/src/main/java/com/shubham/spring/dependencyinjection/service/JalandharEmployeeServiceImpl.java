package com.shubham.spring.dependencyinjection.service;

import org.springframework.stereotype.Service;

@Service
public class JalandharEmployeeServiceImpl implements EmployeeService{

    @Override
    public void getSalary() {
        System.out.println("THe salary is: " + 5000);
    }

    @Override
    public void getAddress() {
        System.out.println("THe address: " + "UrbanEstateJalandhar");
    }
}

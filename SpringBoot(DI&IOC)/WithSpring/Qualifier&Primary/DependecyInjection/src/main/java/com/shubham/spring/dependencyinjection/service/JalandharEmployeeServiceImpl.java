package com.shubham.spring.dependencyinjection.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class JalandharEmployeeServiceImpl implements EmployeeService{

    Map<String, String> employeeMap;

/*    public JalandharEmployeeServiceImpl(){

    }*/

    public JalandharEmployeeServiceImpl(Map<String, String> employeeMap){
        System.out.println("Inside this");
        this.employeeMap = employeeMap;
    }

    @Override
    public void getSalary() {
        System.out.println("THe salary is: " + 5000);
    }

    @Override
    public void getAddress() {
        System.out.println("THe address: " + "UrbanEstateJalandhar");
    }

    @Override
    public void getEmployee() {
        System.out.println(this.employeeMap);
    }
}

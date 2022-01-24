package com.shubham.spring.dependencyinjection.Config;

import com.shubham.spring.dependencyinjection.service.EmployeeService;
import com.shubham.spring.dependencyinjection.service.JalandharEmployeeServiceImpl;
import com.shubham.spring.dependencyinjection.service.PhagwaraEmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class BeanConfiguration {



//    @Bean
//    public EmployeeService employeeBean(){
//        return  new JalandharEmployeeServiceImpl(map);
//    }

    @Bean
    @Primary
    public Map<String, String> injectMap(){
       Map<String, String> map = new HashMap<>();
       map.put("Shubham", "Software Engineer");
       map.put("Ankit Rawat", "Gurudev");
       return  map;
    }
}

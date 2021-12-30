package com.shubham.spring.dependencyinjection.Config;

import com.shubham.spring.dependencyinjection.service.EmployeeService;
import com.shubham.spring.dependencyinjection.service.PhagwaraEmployeeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfiguration {

    @Bean
    @Primary
    public EmployeeService employeeBean(){
        return  new PhagwaraEmployeeServiceImpl();
    }
}

package com.spring.dependency.DependencyInjection;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ClassA {

    ClassB classB;

    ClassA(ClassB classB){
        this.classB = classB;
    }

    @PostConstruct
    public void printHowdy(){
        classB.howdy();


    }
}

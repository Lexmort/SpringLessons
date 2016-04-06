/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3.annotation;

import com.mycompany.mavenproject3.IfInjectSimple;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lexus
 */
@Service("injectSimple")
public class InjectSimple implements IfInjectSimple {

    @Value("Chris Schaefer")
    private String name;
    @Value("32")
    private int age;
    @Value("1.778")
    private float height;
    @Value("true")
    private boolean programmer;
    @Value("1009843200")
    private Long ageinSeconds;

    @Override
    public void setAgeinSeconds(Long ageinSeconds) {
        this.ageinSeconds = ageinSeconds;
    }

    @Override
    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name : " + name + "\n"
                + "Age:" + age + "\n"
                + "Age in Seconds: " + ageinSeconds + "\n"
                + "Height: " + height + "\n"
                + "Is Programmer?: " + programmer;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3.annotation;

import com.mycompany.mavenproject3.xml.*;
import com.mycompany.mavenproject3.IfInjectSimple;
import com.mycompany.mavenproject3.IfInjectSimpleSpel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lexus
 */
@Service("injectSimpleSpel")
public class InjectSimpleSpel implements IfInjectSimpleSpel {
    @Value("#{injectSimpleConfig.name}")
    private String name;
    @Value("#{injectSimpleConfig.age + 10}")
    private int age;
    @Value("#{injectSimpleConfig.height}")
    private float height;
    @Value("#{injectSimpleConfig.programmer}")
    private boolean programmer;
    @Value("#{injectSimpleConfig.ageinSeconds}")
    private Long ageinSeconds;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public float getHeight() {
        return height;
    }

    @Override
    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public boolean isProgrammer() {
        return programmer;
    }

    @Override
    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    @Override
    public Long getAgeinSeconds() {
        return ageinSeconds;
    }

    @Override
    public void setAgeinSeconds(Long ageinSeconds) {
        this.ageinSeconds = ageinSeconds;
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

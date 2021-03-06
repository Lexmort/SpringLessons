/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3.xml;

import com.mycompany.mavenproject3.IfInjectSimple;

/**
 *
 * @author Lexus
 */
public class InjectSimple implements IfInjectSimple {

    private String name;
    private int age;
    private float height;
    private boolean programmer;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3.xml;

/**
 *
 * @author Lexus
 */
public class InjectSimpleConfig {

    private String name = "Chris Schaefer";
    private int age = 38;
    private float height = 1.778f;
    private boolean programmer = true;
    private Long ageinSeconds = 1009843200L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public void setisProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public Long getAgeinSeconds() {
        return ageinSeconds;
    }

    public void setAgeinSeconds(Long ageinSeconds) {
        this.ageinSeconds = ageinSeconds;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3.annotation;

import com.mycompany.mavenproject3.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author Aleks
 */
@Service("messageProvider")
public class ConfigurableMessageProvider implements MessageProvider {
    private String message;
    
    @Autowired
    public ConfigurableMessageProvider(/*@Value("Configurable message")*/ String message) {
        this.message = message;
    }
    
    @Override
    public String getMessage() {
        return message;
    }
}

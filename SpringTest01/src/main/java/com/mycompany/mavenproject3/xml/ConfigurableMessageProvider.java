/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3.xml;

import com.mycompany.mavenproject3.MessageProvider;

/**
 *
 * @author Aleks
 */
public class ConfigurableMessageProvider implements MessageProvider {
    private String message;
    
    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }
    
    @Override
    public String getMessage() {
        return message;
    }
}

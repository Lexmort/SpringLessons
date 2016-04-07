/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3.xml;

import com.mycompany.mavenproject3.IfInjectRef;
import com.mycompany.mavenproject3.Oracle;

/**
 *
 * @author Aleks
 */
public class InjectRef implements IfInjectRef {

    private Oracle oracle;

    public void setOracle(Oracle oracle) {
        this.oracle = oracle;
    }
    
    @Override
    public String toString() {
        return oracle.defineMeaningOfLife();
    }
}

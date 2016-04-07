/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springtest03;

/**
 *
 * @author Lexus
 */
public class BookwormOracle implements Oracle {
    @Override
    public String defineMeaningOfLife() {
        return "Encyclopedias are а waste of money - use the Internet";
    }
    
    @Override
    public String toString() {
        return new StringBuilder("[").append(getClass().getName()).append(']').append(defineMeaningOfLife()).toString();
    }
}

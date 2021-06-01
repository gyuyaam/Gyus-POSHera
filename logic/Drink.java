/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hera.logic;

/**
 *
 * @author gyukim
 */
public class Drink {
    private final String name;
    private final double price;
    
    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String name() {
        return this.name;
    }
    
    public double price() {
        return this.price;
    }
    
}

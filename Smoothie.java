/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hera;

import javafx.scene.control.Button;

/**
 *
 * @author gyukim
 */
public class Smoothie extends Menu {
    
    public Smoothie() {
        super();
    }
    
    public void setup() {
        super.add(new Button("Mango smoothie"), 5.49);
        super.add(new Button("Strawberry smoothie"), 5.49);
        super.add(new Button("Taro smoothie"), 5.49);
        super.add(new Button("Choco smoothie"), 5.49);
        super.add(new Button("Lychee smoothie"), 5.49);
        super.add(new Button("Passion smoothie"), 5.49);
        super.add(new Button("Coconut smoothie"), 5.49);
        super.add(new Button("Cococoffee smoothie"), 5.99);
        
    }
}

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
public class DrinkOptions extends Menu {
    
    public DrinkOptions() {
        super();
    }
    
    public void setup() {
        super.add(new Button("Regular"), 0.0);
        super.add(new Button("Large"), 1.00);
        
        super.add(new Button("Tapioca"), 0.50);
        super.add(new Button("Pudding"), 0.50);
        super.add(new Button("Cheese foam"), 1.00);
    }
}

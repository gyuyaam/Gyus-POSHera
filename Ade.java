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
public class Ade extends Menu {
    
    public Ade() {
        super();
    }
    
    public void setup() {
        super.add(new Button("Mango ade"), 4.99);
        super.add(new Button("Lychee ade"), 5.49);
        super.add(new Button("Passionfruit ade"), 4.99);
        super.add(new Button("Lemon ade"), 4.99);
        super.add(new Button("Grapefruit ade"), 5.49);
    }
}

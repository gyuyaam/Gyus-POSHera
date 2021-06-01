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
public class Vitasoy extends Menu {
    
    public Vitasoy() {
        super();
    }
    
    public void setup() {
        super.add(new Button("VITASOY Coconut chai"), 5.49);
        super.add(new Button("VITASOY Red bean latte"), 5.49);
        super.add(new Button("VITASOY Hazelnut choco"), 5.49);
        super.add(new Button("VITASOY Vanilla matcha"), 5.49);
    }
}

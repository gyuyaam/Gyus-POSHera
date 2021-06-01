/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hera;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 *
 * @author gyukim
 */
public class MilkTea extends Menu {
    
    private HBox menuLayout;
    
    public MilkTea() {
        super();
    }
    
    public void setup() {
        super.add(new Button("Original milk black tea"), 3.49);
        super.add(new Button("Jasmine green milk tea"), 3.99);
        super.add(new Button("Earl grey milk tea"), 3.99);
        super.add(new Button("Oolong milk tea"), 3.99);
        super.add(new Button("Taro milk tea"), 3.99);
        super.add(new Button("Chocolate milk tea"), 4.49);
        super.add(new Button("Mango milk tea"), 4.49);
        super.add(new Button("Strawberry earl grey milk tea"), 4.49);
        super.add(new Button("Coffee milk tea"), 4.49);
        super.add(new Button("Jakeman's maple milk tea"), 5.49);
        super.add(new Button("Black sugar milk tea"), 4.49);
        super.add(new Button("Black sugar red bean matcha milk tea"), 4.49);
        super.add(new Button("Tiramisu milk tea"), 5.49);
        super.add(new Button("Strawberry cheesecake milk tea"), 5.49);
        super.add(new Button("LIMITED Hojicha milk tea"), 4.49);
        super.add(new Button("LIMITED Rooibos milk tea"), 4.49);
    }
}

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
public class FruitTea extends Menu {
    
    public FruitTea() {
        super();
    }
    
    public void setup() {
        //mango
        super.add(new Button("FRUIT Mango black tea"), 4.49);
        super.add(new Button("FRUIT Mango green tea"), 4.49);
        super.add(new Button("FRUIT Mango oolong tea"), 4.49);
        super.add(new Button("FRUIT Mango earl grey tea"), 4.49);
        //strawberry
        super.add(new Button("FRUIT Strawberry black tea"), 4.49);
        super.add(new Button("FRUIT Strawberry green tea"), 4.49);
        super.add(new Button("FRUIT Strawberry oolong tea"), 4.49);
        super.add(new Button("FRUIT Strawberry earl grey tea"), 4.49);
        //lychee
        super.add(new Button("FRUIT Lychee black tea"), 4.99);
        super.add(new Button("FRUIT Lychee green tea"), 4.99);
        super.add(new Button("FRUIT Lychee oolong tea"), 4.99);
        super.add(new Button("FRUIT Lychee earl grey tea"), 4.99);
        //passion fruit
        super.add(new Button("FRUIT Passionfruit black tea"), 4.99);
        super.add(new Button("FRUIT Passionfruit green tea"), 4.99);
        super.add(new Button("FRUIT Passionfruit oolong tea"), 4.99);
        super.add(new Button("FRUIT Passionfruit earl grey tea"), 4.99);
        //lemon
        super.add(new Button("FRUIT Lemon black tea"), 4.49);
        super.add(new Button("FRUIT Lemon green tea"), 4.49);
        super.add(new Button("FRUIT Lemon oolong tea"), 4.49);
        super.add(new Button("FRUIT Lemon earl grey tea"), 4.49);
        //grapefruit
        super.add(new Button("FRUIT Grapefruit black tea"), 4.99);
        super.add(new Button("FRUIT Grapefruit green tea"), 4.99);
        super.add(new Button("FRUIT Grapefruit oolong tea"), 4.99);
        super.add(new Button("FRUIT Grapefruit earl grey tea"), 4.99);
        
    }
}

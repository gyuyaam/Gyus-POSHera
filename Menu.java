/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hera;
import com.mycompany.hera.logic.Drink;
import java.util.ArrayList;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

/**
 *
 * @author gyukim
 */
public class Menu {
    private ArrayList<Button> menu;
    private ArrayList<Drink> drinkMenu;
    private GridPane menuLayout;
    private ArrayList<Double> priceList;
    private HBox hb;
    
    public Menu() {
        this.menu = new ArrayList<>();
        this.menuLayout = new GridPane();
        this.priceList = new ArrayList<>();
        this.drinkMenu = new ArrayList<>();
        this.hb = new HBox();
    }
    
    public void add(Button button, double price) {
        button.setFont(Font.font("Consolas", 15));
        button.setPrefSize(250, 50);
        this.menu.add(button);
        this.drinkMenu.add(new Drink(button.getText(), price));
        this.priceList.add(price);
    }
    
    public ArrayList<Button> menu() {
        return this.menu;
    }
    
    public ArrayList<Double> priceList() {
        return this.priceList;
    }
    
    public ArrayList<Drink> drinkMenu() {
        return this.drinkMenu;
    }
    
    public HBox hLayout() {
        if(this.hb.getChildren().isEmpty()) {
            for(Button button:this.menu) {
                this.hb.getChildren().add(button);
            }
        }
        return this.hb;
    }
    
    public GridPane layout() {
        if(this.menuLayout.getChildren().isEmpty()) {
            int help = 0;
            while(help < this.menu.size()) {
                for(int column = 0; column < 3; column++) {
                    for(int row = 0; row < 7;row++) {
                        this.menuLayout.add((this.menu.get(help)), column, row);
                        help++;
                    }
                }
            }
        }
        return this.menuLayout;
    }
}

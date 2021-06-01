/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hera.logic;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
/**
 *
 * @author gyukim
 */
public class Order {
    private final HashMap<Drink, Integer> order;
    private Double total;
    
    public Order() {
        this.order = new HashMap<>();
        this.total = 0.00;
    }
    
    public HashMap<Drink, Integer> returnOrder() {
        return this.order;
    }
    
    public void add(Drink drink) {
        if(!this.order.containsKey(drink)) {
            this.order.put(drink, 1);
            this.total += drink.price();
        } else {
            int newQuantity = this.order.get(drink) + 1;
            this.order.replace(drink, newQuantity);
            this.total += drink.price();
        }
    }
    
    public void remove(Drink drink) {
        if(!this.order.containsKey(drink)) {
            System.out.println("This drink is not on the order");
        }
        this.order.remove(drink);
        this.total -= drink.price();
    }
    
    public void clear() {
        this.order.clear();
        this.total = 0.00;
    }
    
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    public Double total() {
        return round(this.total, 2);
    }
    
    public Double tax() {
        double tax = round((this.total*0.13), 2);
        return tax;
    }
    
    public Double totalTotal() {
        return round((this.tax()+this.total), 2);
    }
    
}

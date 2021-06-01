/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hera.logic;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 *
 * @author gyukim
 */
public class Sales {
    private ArrayList<Double> salesReport;
    private Double sales;
    private int totalOrders;
    
    private int mtsales;
    private int ftsales;
    private int vssales;
    private int asales;
    private int ssales;
    
    public Sales() {
        this.salesReport = new ArrayList<>();
        this.sales = 0.0;
        this.totalOrders = 0;
        
        mtsales = 0;
        ftsales = 0;
        vssales = 0;
        asales = 0;
        ssales = 0;
    }
    
    public void addSale(Order order) {
        this.salesReport.add(order.total());
        for(Drink drink:order.returnOrder().keySet()) {
            if(drink.name().contains("milk")) {
                mtsales += order.returnOrder().get(drink);                    
            } else if(drink.name().contains("ade")) {
                asales += order.returnOrder().get(drink);
            } else if(drink.name().contains("VITASOY")) {
                vssales += order.returnOrder().get(drink);
            } else if(drink.name().contains("FRUIT")) {
                ftsales += order.returnOrder().get(drink);
            } else if(drink.name().contains("smoothie")) {
                ssales += order.returnOrder().get(drink);
            }
        }
    }
    
    public int totalOrders() {
        if(this.salesReport.isEmpty()) {
            return 0;
        }
        this.totalOrders = this.salesReport.size();
        return totalOrders;
    }
    
    public double sales() {
        for(Double order:this.salesReport) {
            this.sales += order;
        }
        return round(this.sales, 2);
    }
    
    public int mtsales() {
        return this.mtsales;
    }
    
    public int ftsales() {
        return this.ftsales;
    }
    
    public int vssales() {
        return this.vssales;
    }
    
    public int asales() {
        return this.asales;
    }
    
    public int ssales() {
        return this.ssales;
    }
    
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}

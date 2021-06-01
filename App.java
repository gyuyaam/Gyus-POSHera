package com.mycompany.hera;

import com.mycompany.hera.logic.Order;
import com.mycompany.hera.logic.Sales;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    public static void main(String[] args) {
        launch();
        
    }
    
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane layout = new BorderPane();
        layout.setPrefSize(1500, 1000);
        
        //drink menu
        Menu lowerMenu = new Menu();
        DrinkOptions options = new DrinkOptions();
        MilkTea mt = new MilkTea();
        FruitTea ft = new FruitTea();
        Vitasoy vs = new Vitasoy();
        Ade a = new Ade();
        mt.setup();
        ft.setup();
        vs.setup();
        a.setup();
        options.setup();
        //sales
        Order customerOrder = new Order();
        Sales salesReport = new Sales();
        //
        HBox starter = new HBox();
        Label start = new Label("Press a tea to start!");
        start.setFont(Font.font("Nanum Pen Script", 50));
        starter.setAlignment(Pos.CENTER);
        starter.getChildren().add(start);
        //
        lowerMenu.add(new Button("Milk teas"), -1);
        lowerMenu.add(new Button("Fruit teas"), -1);
        lowerMenu.add(new Button("Vitasoy series"), -1);
        lowerMenu.add(new Button("Ades"), -1);
        //
        // 
        for(Button button:lowerMenu.menu()) {
            button.setOnAction((event) -> {
                if(button.getText().equals("Milk teas")) {
                    layout.setCenter(mt.layout());
                } else if(button.getText().equals("Fruit teas")) {
                    layout.setCenter(ft.layout());
                } else if(button.getText().equals("Vitasoy series")){
                    layout.setCenter(vs.hLayout());
                } else if(button.getText().equals("Ades")) {
                    layout.setCenter(a.layout());
                }
            });
        }
        //
        VBox order = new VBox(); //total cost of order, and tax totals
        Label subtotal = new Label("Subtotal = $0.00");
        Label tax = new Label("Tax = $0.00");
        Label total = new Label("Total = $0.00");
        order.getChildren().addAll(subtotal, tax, total);
        BorderPane sideMenu = new BorderPane();
        //
        VBox ordered = new VBox(); //the order shown on the sidemenu
        this.setUp(layout, options, mt, customerOrder, order, ordered, subtotal, tax, total);
        this.setUp(layout, options, ft, customerOrder, order, ordered, subtotal, tax, total);
        this.setUp(layout, options, vs, customerOrder, order, ordered, subtotal, tax, total);
        this.setUp(layout, options, a, customerOrder, order, ordered, subtotal, tax, total);
        //
        VBox idk = new VBox();
        Button pay = new Button("Pay \nNow");
        Button clearOrder = new Button("New \nOrder");
        Button allOrders = new Button("All \nOrders");
        
        Label numberOfSales = new Label();
        Label totalSales = new Label();
        Label mtSales = new Label();
        Label ftSales = new Label();
        Label vsSales = new Label();
        Label aSales = new Label();
        Label sSales = new Label();
        //
        idk.getChildren().addAll(pay, clearOrder, allOrders);
        pay.setOnAction(event -> {
            salesReport.addSale(customerOrder);
            customerOrder.clear();
            ordered.getChildren().clear();
            
            //
            subtotal.setText("Subtotal = $0.00");
            tax.setText("Tax = $0.00");
            total.setText("Total = $0.00");
            order.getChildren().addAll(subtotal, tax, total);

        });
        
        clearOrder.setOnAction(event -> {
            customerOrder.clear();
            ordered.getChildren().clear();
            
            //
            subtotal.setText("Subtotal = $0.00");
            tax.setText("Tax = $0.00");
            total.setText("Total = $0.00");
            order.getChildren().addAll(subtotal, tax, total);

        });
        // sales report
        allOrders.setOnAction(event -> {
            ordered.getChildren().clear();
            
            numberOfSales.setText("Number of orders: " + String.valueOf(salesReport.totalOrders()));
            totalSales.setText("Total sales: $" + String.valueOf(salesReport.sales()));
            mtSales.setText("Milk teas sold: " + salesReport.mtsales());
            ftSales.setText("Fruit teas sold: " + salesReport.ftsales());
            vsSales.setText("Vitasoy drinks sold: " + salesReport.vssales());
            aSales.setText("Ades sold: " + salesReport.asales());
            sSales.setText("Smoothies sold: " + salesReport.ssales());
            ordered.getChildren().addAll(numberOfSales, totalSales, mtSales, ftSales, vsSales, aSales);
        });
        
        //
        VBox intro = new VBox();
        intro.setAlignment(Pos.CENTER);
        Label welcome = new Label("Welcome to Gyu's Yummy Tea Shop!");
        welcome.setFont(Font.font("Nanum Pen Script", 50));
        Button enter = new Button("~Enter~");
        intro.getChildren().addAll(welcome, enter);
        enter.setOnAction((event) -> {
            layout.setBottom(lowerMenu.hLayout());
            layout.setCenter(starter);
            layout.setLeft(idk);
            layout.setRight(sideMenu);
        });
        
        sideMenu.setTop(ordered);
        sideMenu.setBottom(order);
        
        intro.setSpacing(20);
        layout.setCenter(intro);
        
        scene = new Scene(layout);
        stage.setScene(scene);
        stage.setTitle("Gyu's Bubble Tea Shop");
        stage.show();
    }
    
    public void setUp(BorderPane layout, DrinkOptions options, 
            Menu category, Order customer, VBox order, 
            VBox ordered, Label subtotal, Label tax, Label total) {
        for(Button button:category.menu()) {
            button.setOnAction(event -> {
                ordered.getChildren().add(new Label(button.getText()));
                customer.add(category.drinkMenu().get(category.menu().indexOf(button)));
                layout.setCenter(options.hLayout());
                for(Button subbutton:options.menu()) {
                    subbutton.setOnAction((subevent) -> {
                        ordered.getChildren().add(new Label(subbutton.getText()));
                        customer.add(options.drinkMenu().get(options.menu().indexOf(subbutton)));
                        
                        subtotal.setText("Subtotal: $" + customer.total());
                        tax.setText("Tax: $" + customer.tax());
                        total.setText("Total: $" + customer.totalTotal());
                        order.getChildren().addAll(subtotal, tax, total);
                    });
                }
                //
                subtotal.setText("Subtotal: $" + customer.total());
                tax.setText("Tax: $" + customer.tax());
                total.setText("Total: $" + customer.totalTotal());
                order.getChildren().addAll(subtotal, tax, total);
            });
        }
    }
}
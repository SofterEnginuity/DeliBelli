package com.pluralsight.OrderManagement;


import com.pluralsight.Side.Chips;
import com.pluralsight.Side.Drink;
import com.pluralsight.sandwich.Sandwich;
import com.pluralsight.sandwich.toppings.Toppings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OrderFileManager {

public void saveOrder(Order order){

    String fileName = "order.csv";
    try {
        FileWriter fileWriter = new FileWriter("orders.txt");
        BufferedWriter writer = new BufferedWriter(fileWriter);


        for (Sandwich sandwich : order.getSandwiches()) {
            writer.write("SANDWICH");  // write a header line
            writer.newLine();

            for (Toppings topping : sandwich.getToppings()) {
                writer.write("TOPPING|" + topping.getName());  // or topping.toString()
                writer.newLine();
            }
        }


        for (Chips chip : order.getChips()) {
            writer.write("CHIP|" + chip.getBrand()); //+ getPrice()
            writer.newLine();
        }

        for (Drink drink : order.getDrinks()) {
            writer.write("DRINK|" + drink.getName() + "|" + drink.getSize()); //+ getPrice()
            writer.newLine();
        }



        writer.close();
    } catch (IOException e) {
        System.out.println("Error writing file: " + e.getMessage());
    }


    }
}


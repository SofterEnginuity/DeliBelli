package com.pluralsight.OrderManagement;


import com.pluralsight.Side.Chips;
import com.pluralsight.Side.Drink;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OrderFileManager {

public void saveOrder(Order order){

    String fileName = "order.csv";
    try {
        FileWriter fileWriter = new FileWriter("orders.txt");
        BufferedWriter writer = new BufferedWriter(fileWriter);


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


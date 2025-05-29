package com.pluralsight.OrderManagement;


import com.pluralsight.Side.Chips;
import com.pluralsight.Side.Drink;
import com.pluralsight.sandwich.Sandwich;
import com.pluralsight.sandwich.toppings.Toppings;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class OrderFileManager {

public static void saveOrder(Order order){
    String timeStamp = LocalDateTime.now()
            .format(DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss"));
    String fileName = "receipts/" + timeStamp + ".txt";
    try {
        File folder = new File("receipts");
        if (!folder.exists()) {
            folder.mkdirs();
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        writer.write("RECEIPT");
        writer.newLine();
        writer.write("DeliBelli's");
        writer.newLine();
        writer.write("(515-555-5555)");
        writer.newLine();
        writer.write("123 Main st, Philadelphia PA 12345");
        writer.newLine();
        writer.write("----------------------------------------");

        writer.newLine();

        for (Sandwich sandwich : order.getSandwich()) {
            writer.write("SANDWICHES");
            writer.newLine();

            for (Toppings topping : sandwich.getToppings()) {
                writer.write("TOPPINGS|" + topping.getName());
                writer.newLine();
            }
        }

        for (Chips chip : order.getChips()) {
            writer.write("CHIPS|" + chip.getBrand());
            writer.newLine();
        }

        for (Drink drink : order.getDrinks()) {
            writer.write("DRINKS|" + drink.getName() + "|" + drink.getSize());
            writer.newLine();
        }

        writer.write("TOTAL|" + order.totalPrice());
        writer.newLine();

        writer.close();
    } catch (IOException e) {
        System.out.println("Error writing file: " + e.getMessage());
    }
    System.exit(0);
    }






}


package com.pluralsight.OrderManagement;


import com.pluralsight.Side.Chips;
import com.pluralsight.Side.Drink;
import com.pluralsight.sandwich.Sandwich;
import com.pluralsight.sandwich.toppings.Toppings;
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class OrderFileManager {

public void saveOrder(Order order){
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
            writer.write("SANDWICH");
            writer.newLine();

            writer.write("Toppings:");
            boolean first = true;
            for (Toppings topping : sandwich.getToppings()) {
                if (!first) writer.write(", ");
                writer.write(topping.getName());
                first = false;
            }
            writer.newLine();
        }

        for (Chips chip : order.getChips()) {
            writer.write("CHIPS" + "|" + chip.getBrand());
            writer.newLine();
        }
        for (Drink drink : order.getDrinks()) {
            String sML;
            if(drink.getSize() == 1){
                sML = "(Small)";
            }else if (drink.getSize() == 2){
                sML = "(Medium)";
            }else{
                sML = "(Large)";
            }
            writer.write("DRINKS " + "|" + sML  + drink.getName());
            writer.newLine();
        }

        writer.write("TOTAL      $" + order.totalPrice());
        writer.newLine();

        writer.close();
    } catch (IOException e) {
        System.out.println("Error writing file: " + e.getMessage());
    }
    System.exit(0);
    }






}


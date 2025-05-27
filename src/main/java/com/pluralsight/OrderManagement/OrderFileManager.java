package com.pluralsight.OrderManagement;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OrderFileManager {
    public static class fileManager{



}
public void saveOrder(Order order){
    String fileName = "order.csv";

    try {
        FileWriter fileWriter = new FileWriter("orders.txt");
        BufferedWriter writer = new BufferedWriter(fileWriter);

         writer.write(fileName);
        // writer.newLine();

        

        writer.close();
    } catch (IOException e) {
        System.out.println("Error writing file: " + e.getMessage());
    }

}






    }
}

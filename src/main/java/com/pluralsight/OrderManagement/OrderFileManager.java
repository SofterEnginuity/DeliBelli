package com.pluralsight.OrderManagement;


import com.pluralsight.Side.Chips;
import com.pluralsight.Side.Drink;
import com.pluralsight.sandwich.Sandwich;
import com.pluralsight.sandwich.toppings.Toppings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class OrderFileManager {

public void saveOrder(Order order){
    Scanner scanner = new Scanner(System.in);
    try {
        FileWriter fileWriter = new FileWriter("orders.txt");
        BufferedWriter writer = new BufferedWriter(fileWriter);


        for (Sandwich sandwich : order.getSandwich()) {
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

//why is it yellin at me about parameters??

//    public void checkOut(){
//        System.out.println("To confirm your Order is correct and checkout, enter a C");
//        String readyToCheckout = scanner.nextLine();
//        if(!readyToCheckout.equalsIgnoreCase("C")){
//            System.out.println("Please make a valid selection");
//        }else{
//            System.out.println("Please enter the denomination you would like to use to pay.");
//            System.out.println("1 - $5.00\n 2 - $10.00\n 3 - $20.00 \n 4 - $50.00\n $100.00\n6 - Exact Change");
//            int userPayment = scanner.nextInt();
//            //have a totalPrice ready for user
//            //give options for denominations
//            //take denom and subtract total price from it, provide change
//            //prompt if not enough has been paid
//
//        }return;
//    }


//    public void printReceipt(Receipt receipt){
//print all sandwich information and prices formatted into a document
// should each receipt be its own document?
        return;
//    }




//do logic in here? then method checkout/printReceipt??
//    private double paymentAmount;
//    private String payment type
//    private double change;
//    private List<Receipt> items = new Receipt(paymentAmount, totalPrice, change);;

    }

//
}


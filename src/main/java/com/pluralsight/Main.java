package com.pluralsight;

import com.pluralsight.OrderManagement.Order;

import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("O - Create a new order");
                System.out.println("X - Exit Deli");

                String userInput = scanner.nextLine();

                if (userInput.equalsIgnoreCase("O")) {
                    Order currentOrder = new Order(); // ✅ create once here
                    Home home = new Home(currentOrder); // ✅ pass it in
                    home.displayUserInterface();        // now it’s shared and reused
                } else if (userInput.equalsIgnoreCase("X")) {
                    System.out.println("Goodbye!");
                } else {
                    System.out.println("Invalid input. Restart the app.");
                }
            }
        }
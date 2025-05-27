package com.pluralsight;

import com.pluralsight.OrderManagement.Order;
import com.pluralsight.Side.Chips;
import com.pluralsight.Side.Drink;

import java.util.Scanner;

public class Home {

    private Order currentOrder;

    public void displayUserInterface() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("O - Create a new order");
        System.out.println("X - Exit Deli");
        String userInput = scanner.nextLine();
        System.out.println(userInput);

        if (userInput.equalsIgnoreCase("O")) {
            System.out.println("New Order menu options");

            int selection = -1;
            do {
                System.out.println("\nPlease make a selection: ");
//            System.out.println("1   Build your Sandwich");
                System.out.println("2   Chips");
                System.out.println("3   Drink");
                System.out.println("4   Extras");//?
//            System.out.println("5   ");
//            System.out.println("6  ");
                System.out.println("0   Exit");

                if (scanner.hasNextInt()) {
                    selection = scanner.nextInt();
                    scanner.nextLine();
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.nextLine();
                    continue;
                }

                switch (selection) {
                    case 1:
//processGetSandwich();
                        break;
                    case 2:
                        System.out.println("Please select a brand of chips(Lays BBQ, Ruffles Potato, Doritos, Cheetos, Pretzels");
                        String userChips = scanner.nextLine();
                        Chips chip = new Chips(userChips);
                        chip.setBrand(userChips);
                        currentOrder.addChips(chip);
                        System.out.println(userChips + " added to your order.");
                        break;
                    case 3:
                        System.out.println("Please type the drink you would like: (Sprite, Dr Pepper, Pepsi, Root Beer, Apple Juice, Orange Juice, Water)");
                        String userDrink;
                        while (true) {
                            System.out.println("Please select a drink:");
                            userDrink = scanner.nextLine().trim();
                            if (userDrink.equalsIgnoreCase("Sprite") ||
                                    userDrink.equalsIgnoreCase("Dr Pepper") ||
                                    userDrink.equalsIgnoreCase("Pepsi") ||
                                    userDrink.equalsIgnoreCase("Root Beer") ||
                                    userDrink.equalsIgnoreCase("Apple Juice") ||
                                    userDrink.equalsIgnoreCase("Orange Juice") ||
                                    userDrink.equalsIgnoreCase("Water")) {
                                break;
                            } else {
                                System.out.println("Please make a valid selection.");
                            }
                        }
                        int size = 0;
                        while (true) {
                            System.out.println("Please select the size you would like:");
                            System.out.println("1 - Small");
                            System.out.println("2 - Medium");
                            System.out.println("3 - Large");

                            if (scanner.hasNextInt()) {
                                size = scanner.nextInt();
                                scanner.nextLine(); // consume the leftover newline
                                if (size == 1 || size == 2 || size == 3) {
                                    break;
                                } else {
                                    System.out.println("Please select a valid size option (1, 2, or 3).");
                                }
                            } else {
                                System.out.println("Invalid input. Please enter a number (1, 2, or 3).");
                                scanner.nextLine();
                            }
                        }
                        Drink drink = new Drink(userDrink, size);
                        currentOrder.addDrink(drink);
                        break;

//                    case 4:

                    case 5:
//                        Order.checkOut();
                        System.out.println("Checkout");



                    case 0:
                        System.out.println("Thank you for coming to DeliBelli");
                        break;
                    default:
                        System.out.println("Invalid selection.");
                }

            } while (selection != 0);

        } else if(userInput.equalsIgnoreCase("X")){
            System.out.println("Exiting Deli..");
        }else{
            System.out.println("Please make a valid selection");
        }
//        OrderFileManager.getOrderDetails();
    }


}


package com.pluralsight;

import com.pluralsight.OrderManagement.Order;
import com.pluralsight.Side.Chips;
import com.pluralsight.Side.Drink;
import com.pluralsight.sandwich.Sandwich;
import com.pluralsight.sandwich.toppings.Regular;
import com.pluralsight.sandwich.toppings.Sauce;
import com.pluralsight.sandwich.toppings.Toppings;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
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

                        System.out.println("Select the size of sandwich you would like (4, 8, or 12)");
                        int sandwichSize = scanner.nextInt();
                        double sandwichPrice = 0;
                        if (sandwichSize == 4) {
                            sandwichPrice = 1.00;
                        } else if (sandwichSize == 8) {
                            sandwichPrice = 2.00;
                        } else if (sandwichSize == 12) {
                            sandwichPrice = 3.00;
                        }

                        System.out.println("Please enter the type of bread you would like (White, Wheat, Rye, Wrap");
                        String bread = scanner.nextLine();

                        System.out.println("Please enter the sauce that you would like. (Mayo, Mustard, Ketchup, Ranch, Thousand Island, Vinaigrette, Au Jus, ");
                        String userSauce = scanner.nextLine();
                        Sauce sauce = new Sauce(userSauce);
//I have sauce class- i make new sauce BUT i dont have toasted class - make new toppings class? add toppings??


                        System.out.println("Would you like your sandwich toasted? (Y - Yes, N- No) ");
                        String userToasted = scanner.nextLine().trim().toLowerCase();
                        boolean toasted = userToasted.equals("y");

                        System.out.println("Would you like extra Meat? (Y - Yes, N- No) ");
                        String userExtraMeat = scanner.nextLine().trim().toLowerCase();
                        boolean extraMeat = userExtraMeat.equals("y");

                        System.out.println("Would you like extra Cheese? (Y - Yes, N- No) ");
                        String userExtraCheese = scanner.nextLine().trim().toLowerCase();
                        boolean extraCheese = userExtraCheese.equals("y");
//creating the sandwich

                        Sandwich sandwich = new Sandwich(bread, sandwichSize, toasted, extraMeat, extraCheese);
//gathering the toppings
//halp
                        System.out.println("Please enter the toppings you would like, separated by commas (Lettuce, Peppers, Onions, Tomatoes, Jalapenos, Cucumbers, Pickles, Guacamole, Mushrooms");
                        String[] userToppings = scanner.nextLine().split(",");

//                        Sandwich.addToppings();       orrrrrrr
//                        for (String topping : userToppings) {
//                            sandwich.addTopping(new Regular(topping.trim()));
 //wants 6 parameters because of super//??
//                        }
                        System.out.println(Arrays.toString(userToppings));
//more than one meat??
                        System.out.println("Please enter the Meat(s) you would like (Steak, Ham, Salami, Roast Beef, Chicken, Bacon)");
                        String userMeat = scanner.nextLine();


                        System.out.println("Please enter the Cheese that you would like (Provolone, Cheddar, Swiss, American, Gouda)");
                        String userCheese = scanner.nextLine();

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
                        int drinkSize = 0;
                        while (true) {
                            System.out.println("Please select the size you would like:");
                            System.out.println("1 - Small");
                            System.out.println("2 - Medium");
                            System.out.println("3 - Large");

                            if (scanner.hasNextInt()) {
                                drinkSize = scanner.nextInt();
                                scanner.nextLine();
                                if (drinkSize == 1 || drinkSize == 2 || drinkSize == 3) {
                                    break;
                                } else {
                                    System.out.println("Please select a valid size option (1, 2, or 3).");
                                }
                            } else {
                                System.out.println("Invalid input. Please enter a number (1, 2, or 3).");
                                scanner.nextLine();
                            }
                        }
                        Drink drink = new Drink(userDrink, drinkSize);
                        currentOrder.addDrink(drink);
                        break;

                    case 4:


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


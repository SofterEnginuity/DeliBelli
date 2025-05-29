package com.pluralsight;

import com.pluralsight.OrderManagement.Order;
import com.pluralsight.Side.Chips;
import com.pluralsight.Side.Drink;
import com.pluralsight.sandwich.Sandwich;
import com.pluralsight.sandwich.toppings.Cheese;
import com.pluralsight.sandwich.toppings.Meat;
import com.pluralsight.sandwich.toppings.Regular;
import com.pluralsight.sandwich.toppings.Sauce;

import java.util.Arrays;
import java.util.Scanner;

public class Home {

    private Order currentOrder;

    public void displayUserInterface() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("O - Create a new order");
        System.out.println("X - Exit Deli");
        String userInput = scanner.nextLine();
        System.out.println(userInput);


        if (userInput.equalsIgnoreCase("O") || userInput.equalsIgnoreCase("0") ) {
            currentOrder = new Order();
            System.out.println("New Order menu options");

            int selection = -1;
            do {
                System.out.println("\nPlease make a selection: ");
                System.out.println("1   Build your Sandwich");
                System.out.println("2   Chips");
                System.out.println("3   Drink");
                System.out.println("4   Checkout ");
//            System.out.println("4  ");
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
                        int size = scanner.nextInt();
//                        System.out.println(Sandwich.getSandwichPrice(size));

                        System.out.println("Please enter the type of bread you would like (White, Wheat, Rye, Wrap");
                        String bread = scanner.nextLine();
                        scanner.nextLine();
                        if (!bread.isEmpty()) {
                            break;
                        }



                        System.out.println("Would you like your sandwich toasted? (Y - Yes, N- No) ");
                        String userToasted = scanner.nextLine().trim().toLowerCase();
                        boolean toasted = userToasted.equals("y");

                        Sandwich sandwich = new Sandwich(bread, size, toasted);
                        System.out.println("Please enter the toppings you would like (Lettuce, Peppers, Onions, Tomatoes, Jalapenos, Cucumbers, Pickles, Guacamole, Mushrooms");
                        String[] userToppings = scanner.nextLine().split(" ");
                        for (String topping : userToppings) {
                            sandwich.addTopping(new Regular(topping.trim()));
                        }
//more than one meat??
                        System.out.println("Please enter the Meat(s) you would like (Steak, Ham, Salami, Roast Beef, Chicken, Bacon)");
                        String[] userMeats = scanner.nextLine().split(" ");
                        for (String meatName : userMeats) {
                            sandwich.addTopping(new Meat(meatName.trim()));
                        }


                        System.out.println("Would you like extra Meat? (Y - Yes, N- No) ");
                        String userExtraMeat = scanner.nextLine().trim().toLowerCase();
                        boolean extraMeat = userExtraMeat.equals("y");

                        sandwich.addTopping(new Regular(userExtraMeat));

//more than one chz??
                        System.out.println("Please enter the Cheese that you would like (Provolone, Cheddar, Swiss, American, Gouda)");
                        String [] userCheese = scanner.nextLine().split(" ");
                        sandwich.addTopping(new Cheese(userCheese));

                        System.out.println("Would you like extra Cheese? (Y - Yes, N- No) ");
                        String userExtraCheese = scanner.nextLine().trim().toLowerCase();
                        boolean extraCheese = userExtraCheese.equals("y");

                        sandwich.addTopping(new Regular(userExtraCheese));

                        System.out.println("Please enter the sauces that you would like. (Mayo, Mustard, Ketchup, Ranch, Thousand Island, Vinaigrette, Au Jus, ");
                        String userSauce = scanner.nextLine();
                        sandwich.addTopping(new Sauce(userSauce));
//

                        System.out.println("Sandwich size is:  " + size + " inches");
                        System.out.println("Selected bread is: " + bread);
//                        System.out.println("Selected toppings are: " + Arrays.toString(userToppings));
                        System.out.println("Toasted:" + userToasted);
                        System.out.println("Selected Meat: " + sandwich.getMeatList());
                        System.out.println("Extra Meat: " + extraMeat);
                        System.out.println("Selected Cheese: " + sandwich.getCheeseList());
                        System.out.println("Extra Cheese: " + extraCheese);
                        System.out.println("Selected sauce is: " + userSauce);
                        System.out.println("Toppings: " + sandwich.getToppingsList());


//                        System.out.println(currentOrder);

                        currentOrder.addSandwich(sandwich);
                        System.out.println(sandwich.fullSandwichPrice(size));
//                        System.out.println(currentOrder.totalPrice());



//OrderFileManager.saveOrder();
                        break;

                    case 2:
                        System.out.println("Please select a brand of chips(Lays BBQ, Ruffles Potato, Doritos, Cheetos, Pretzels");
                        String userChips = scanner.nextLine();
                        Chips chip = new Chips(userChips);
                        chip.setBrand(userChips);
                        currentOrder.addChips(chip);
                        System.out.println(userChips + " added to your order.");
                        System.out.println(currentOrder.getChips());
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
                        System.out.println(userDrink + " added to your order.");
                        System.out.println(currentOrder.getDrinks());
                        break;

                    case 4:
                        currentOrder.getOrderDetails();

                    case 5:




                    case 0:

                        break;
                    default:
                        System.out.println("Invalid selection.");
                }

            } while (selection != 0);

        } else if (userInput.equalsIgnoreCase("X")) {
            System.out.println("Exiting Deli..");
        } else {
            System.out.println("Please make a valid selection");
        }
//        OrderFileManager.getOrderDetails();


//        System.out.println(currentOrder);/
    }


}


package com.pluralsight;

import com.pluralsight.OrderManagement.Order;
import com.pluralsight.Side.Chips;
import com.pluralsight.Side.Drink;
import com.pluralsight.sandwich.Sandwich;
import com.pluralsight.sandwich.toppings.Cheese;
import com.pluralsight.sandwich.toppings.Meat;
import com.pluralsight.sandwich.toppings.Regular;

import java.util.Scanner;

public class Home {

    private Order currentOrder;

    public Home(Order order) {
        this.currentOrder = order;
    }

    public void displayUserInterface() {
        Scanner scanner = new Scanner(System.in);

            int selection = -1;
            do {
                System.out.println("Please make a selection: ");
                System.out.println("1   Build your Sandwich");
                System.out.println("2   Chips");
                System.out.println("3   Drink");
                System.out.println("4   View Order");
                System.out.println("5   Checkout ");
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
                        scanner.nextLine();

                        System.out.println();
                        System.out.println("Please enter the type of bread you would like");
                        System.out.println("White, Wheat, Rye, Wrap");
                        String userBread = "";
                        while (true) {
                            userBread = scanner.nextLine().trim();
                            if (userBread.equalsIgnoreCase("White") ||
                                    userBread.equalsIgnoreCase("Wheat") ||
                                    userBread.equalsIgnoreCase("Rye") ||
                                    userBread.equalsIgnoreCase("Wrap")) {
                                break;
                            } else {
                                System.out.println("Invalid bread. Please enter White, Wheat, Rye, or Wrap:");
                            }
                        }

                        System.out.println("Would you like your sandwich toasted? (Y - Yes, N - No)");
                        String userToasted = scanner.nextLine().trim().toLowerCase();
                        boolean toasted = userToasted.equals("y");
                        Sandwich sandwich = new Sandwich(userBread, size, toasted);
                        sandwich.addTopping(new Regular(userBread));

                        System.out.println("Enter your toppings one at a time (type 'x' when finished)");
                        System.out.println("Lettuce, Peppers, Onions, Tomatoes, Jalapenos, Cucumbers, Pickles, Guacamole, Mushrooms");

                        while (true) {
                            String toppingsInput = scanner.nextLine().trim();
                            if (toppingsInput.equalsIgnoreCase("x")) {
                                break;
                            }
                            if (toppingsInput.equalsIgnoreCase("Lettuce") ||
                                    toppingsInput.equalsIgnoreCase("Peppers") ||
                                    toppingsInput.equalsIgnoreCase("Onions") ||
                                    toppingsInput.equalsIgnoreCase("Tomatoes") ||
                                    toppingsInput.equalsIgnoreCase("Jalapenos") ||
                                    toppingsInput.equalsIgnoreCase("Cucumbers") ||
                                    toppingsInput.equalsIgnoreCase("Pickles") ||
                                    toppingsInput.equalsIgnoreCase("Guacamole") ||
                                    toppingsInput.equalsIgnoreCase("Mushrooms")) {
                                sandwich.addTopping(new Regular(toppingsInput));
                            } else if (!toppingsInput.isEmpty()) {
                                System.out.println("Invalid topping. Please enter a valid option or 'x' to finish.");
                            }
                        }

                        System.out.println();
                        System.out.println("Enter your meats one at a time (type 'x' when finished):");
                        System.out.println("Steak, Ham, Salami, Roast Beef, Chicken, Bacon");
                        while (true) {
                            String meatInput = scanner.nextLine().trim();

                            if (meatInput.equalsIgnoreCase("x")) {
                                break;
                            }

                            if (meatInput.equalsIgnoreCase("Steak") ||
                                    meatInput.equalsIgnoreCase("Ham") ||
                                    meatInput.equalsIgnoreCase("Salami") ||
                                    meatInput.equalsIgnoreCase("Roast Beef") ||
                                    meatInput.equalsIgnoreCase("Chicken") ||
                                    meatInput.equalsIgnoreCase("Bacon")) {

                                sandwich.addTopping(new Meat(meatInput));
                            } else if (!meatInput.isEmpty()) {
                                System.out.println("Invalid meat. Please enter a valid option or 'x' to finish.");
                            }
                        }

                        System.out.println();
                        System.out.println("Would you like extra Meat? (Y - Yes, N - No)");
                        String userExtraMeat = scanner.nextLine().trim().toLowerCase();
                        boolean extraMeat = userExtraMeat.equals("y");
                        sandwich.setExtraMeat(extraMeat);

                        System.out.println();
                        System.out.println("Enter your cheeses one at a time (type 'x' when finished):");
                        System.out.println("Provolone, Cheddar, Swiss, American, Gouda");

                        while (true) {
                            String cheeseInput = scanner.nextLine().trim();

                            if (cheeseInput.equalsIgnoreCase("x")) {
                                break;
                            }
                            if (cheeseInput.equalsIgnoreCase("Provolone") ||
                                    cheeseInput.equalsIgnoreCase("Cheddar") ||
                                    cheeseInput.equalsIgnoreCase("Swiss") ||
                                    cheeseInput.equalsIgnoreCase("American") ||
                                    cheeseInput.equalsIgnoreCase("Gouda")) {

                                sandwich.addTopping(new Cheese(cheeseInput));
                            } else if (!cheeseInput.isEmpty()) {
                                System.out.println("Invalid cheese. Please enter a valid option or 'x' to finish.");
                            }
                        }

                        System.out.println();
                        System.out.println("Would you like extra Cheese? (Y - Yes, N - No)");
                        String userExtraCheese = scanner.nextLine().trim().toLowerCase();
                        boolean extraCheese = userExtraCheese.equals("y");
                        sandwich.setExtraCheese(extraCheese);

                        System.out.println();
                        System.out.println("Enter your sauces one at a time (type 'x' when finished):");
                        System.out.println("Mayo, Mustard, Ketchup, Ranch, Thousand Island, Vinaigrette, Au Jus");

                        while (true) {
                            String sauceInput = scanner.nextLine().trim();
                            if (sauceInput.equalsIgnoreCase("x")) {
                                break;
                            }
                            if (sauceInput.equalsIgnoreCase("Mayo") ||
                                    sauceInput.equalsIgnoreCase("Mustard") ||
                                    sauceInput.equalsIgnoreCase("Ketchup") ||
                                    sauceInput.equalsIgnoreCase("Ranch") ||
                                    sauceInput.equalsIgnoreCase("Thousand Island") ||
                                    sauceInput.equalsIgnoreCase("Vinaigrette") ||
                                    sauceInput.equalsIgnoreCase("Au Jus")) {

                                sandwich.addTopping(new Regular(sauceInput));
                            } else if (!sauceInput.isEmpty()) {
                                System.out.println("Invalid sauce. Please enter a valid option or 'x' to finish.");
                            }
                        }

                        System.out.println();
                        System.out.println(size + " inch Sandwich added to your order.     $" + sandwich.getFullSandwichPrice());
                        System.out.println("Bread Type: " + userBread);
                        System.out.println("Toasted: " + (toasted ? "Yes" : "No"));
                        System.out.println("Extra Meat: " + extraMeat);
                        System.out.println("Extra Cheese: " + extraCheese);
                        System.out.println("Toppings: " + sandwich.getToppingsList());
                        System.out.println();
                        currentOrder.addSandwich(sandwich);
                        break;

                    case 2:
                        System.out.println("Please select a brand of chips (Bbq, Potato, Cheesy Puff, Pretzel):");
                        String userChips = scanner.nextLine();
                        while (!userChips.equalsIgnoreCase("Bbq") &&
                                !userChips.equalsIgnoreCase("Potato") &&
                                !userChips.equalsIgnoreCase("Cheesy Puff") &&
                                !userChips.equalsIgnoreCase("Pretzel")) {
                            System.out.println("Invalid chip brand. Please choose from (Bbq, Potato, Cheesy Puff, Pretzel):");
                            userChips = scanner.nextLine();
                        }
                        Chips chip = new Chips(userChips);
                        chip.setBrand(userChips);
                        currentOrder.addChips(chip);
                        System.out.println(userChips + " chips added to your order.   $" + chip.getChipPrice());
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
                        String sML;
                        if(drink.getSize() == 1){
                            sML = "Small";
                        }else if (drink.getSize() == 2){
                            sML = "Medium";
                        }else{
                            sML = "Large";
                        }
                        System.out.println(sML + " " + userDrink + " added to your order.   $" + drink.getDrinkPrice());
                    case 4:
                        System.out.println("\nCart");
                        currentOrder.getOrderDetails();
                        break;
                    case 5:
                        System.out.println("\nCheckout");
                        currentOrder.checkOut();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Invalid selection.");
                }
            } while (selection != 0);
        }
    }




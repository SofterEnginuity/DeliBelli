package com.pluralsight.OrderManagement;

import com.pluralsight.Home;
import com.pluralsight.Side.Chips;
import com.pluralsight.Side.Drink;
import com.pluralsight.sandwich.Sandwich;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    Scanner scanner = new Scanner(System.in);
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;

    public Order() {
        this.sandwiches = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.chips = new ArrayList<>();
    }

    public List<Sandwich> getSandwich() {
        return sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addChips(Chips chip) {
        chips.add(chip);
    }

    public double totalPrice() {
        double basePrice = 0;

        for (Sandwich sandwich : sandwiches) {
            basePrice += sandwich.getFullSandwichPrice();
        }
        for (Drink drink : drinks) {
            basePrice += drink.getDrinkPrice();
        }
        for (Chips chip : chips) {
            basePrice += chip.getChipPrice();
        }
        return basePrice;

    }

    public void getOrderDetails() {
        for (Sandwich sandwich : sandwiches) {
            System.out.println("Sandwich - $" + sandwich.getFullSandwichPrice());
        }
        for (Drink drink : drinks) {
            String sML;
            if(drink.getSize() == 1){
                sML = "(Small)";
            }else if (drink.getSize() == 2){
                sML = "(Medium)";
            }else{
                sML = "(Large)";
            }
            System.out.println(drink.getName() + " (" +  sML + ")" + " -  $" + drink.getDrinkPrice());
        }
        for (Chips chip : chips) {
            System.out.println(chip.getBrand() + " -  $" + chip.getChipPrice());
        }

        System.out.println("Total:" + totalPrice());

    }

public void checkOut() {
        getOrderDetails();
        System.out.println("To confirm your Order is correct and checkout, enter a C");
        System.out.println("To Cancel your order and return to the main menu, enter an 'X");

        while (true) {
            String readyToCheckout = scanner.nextLine();

            if (readyToCheckout.equalsIgnoreCase("X")) {
                sandwiches.clear();
                drinks.clear();
                chips.clear();
                System.out.println("Order cancelled. Returning to home screen...\n");
                Home home = new Home();
                home.displayUserInterface();
                break;
            } else if (readyToCheckout.equalsIgnoreCase("C")) {
                System.out.println("Please enter the denomination you would like to use to pay.");
                System.out.println("1 - $5.00\n 2 - $10.00\n 3 - $20.00 \n 4 - $50.00\n 5 - $100.00\n 6 - Exact Change");
                int userDenom;
                double userPayment = 0.0;
                try {
                    userDenom = scanner.nextInt();
                    scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.nextLine();
                    continue;
                }

                if (userDenom == 1) {
                    userPayment = 5.00;
                } else if (userDenom == 2) {
                    userPayment = 10.00;
                } else if (userDenom == 3) {
                    userPayment = 20.00;
                } else if (userDenom == 4) {
                    userPayment = 50.00;
                } else if (userDenom == 5) {
                    userPayment = 100.00;
                } else if (userDenom == 6) {
                    userPayment = totalPrice();
                } else {
                    System.out.println("Invalid denomination.");
                    continue;
                }

                double change = userPayment - totalPrice();
                if (change < 0) {
                    System.out.println("Not enough payment!");
                } else {
                    System.out.println("Thank you for your payment!");
                    System.out.println("Your change is: $" + change);
                    OrderFileManager fileManager = new OrderFileManager();
                    fileManager.saveOrder(this);
                    break;
                }

            } else {
                System.out.println("Invalid input. Please enter 'C' or 'X'.");
            }
        }
      }

    @Override
    public String toString() {
        return "Order{" +
                "scanner=" + scanner +
                ", sandwiches=" + sandwiches +
                ", drinks=" + drinks +
                ", chips=" + chips +
                '}';
    }
}

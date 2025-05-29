package com.pluralsight.OrderManagement;

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
        this.chips =new ArrayList<>();
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

    public void addSandwich(Sandwich sandwich){
        sandwiches.add(sandwich);
    }
    public void addDrink(Drink drink){
        drinks.add(drink);
    }
    public void addChips(Chips chip){
        chips.add(chip);
    }
    public double totalPrice(){
        double basePrice = 0;

        for (Sandwich sandwich : sandwiches) {
            basePrice += sandwich.fullSandwichPrice(sandwich.getSize());
        }
        for (Drink drink : drinks) {
            basePrice += drink.getDrinkPrice();
        }
        for (Chips chip : chips) {
            basePrice += chip.getChipPrice();
        }
        return basePrice;

    }
    public void cancelOrder(){
        System.exit(0);
    }
    public void getOrderDetails(){
        for (Sandwich sandwich : sandwiches) {
            System.out.println(sandwich);
            System.out.println(sandwich.fullSandwichPrice(sandwich.getSize()));
        }
        for (Drink drink : drinks) {
            System.out.println( drink.getSize()+ " , " + drink.getName());
            System.out.println(drink.getDrinkPrice());
        }
        for (Chips chip : chips) {
            System.out.println(chip.getBrand());
            System.out.println(chip.getChipPrice());
        }

        System.out.println("Total:" + totalPrice());

    }
    public void checkOut(){
        getOrderDetails();
        System.out.println("To confirm your Order is correct and checkout, enter a C");
        String readyToCheckout = scanner.nextLine();
        if(!readyToCheckout.equalsIgnoreCase("C")){
            System.out.println("Please make a valid selection");
        }else{
            System.out.println("Please enter the denomination you would like to use to pay.");
            System.out.println("1 - $5.00\n 2 - $10.00\n 3 - $20.00 \n 4 - $50.00\n 5 - $100.00\n 6 - Exact Change");
            int userDenom = scanner.nextInt();
            double userPayment = 0.0;

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
            }
            double change = userPayment - totalPrice();

            if (change < 0) {
                System.out.println("Not enough payment!");
            } else {
                System.out.println("Thank you for your payment!");
                System.out.println("Your change is: $" + change);


//                OrderFileManager.saveOrder(currentOrder);


            }
            return;
        }
    }


    @Override
    public String toString() {
        return "Order:\n" +
                "Sandwiches:" + sandwiches +
                ", Drinks:" + drinks +
                ", Chips:" + chips +
                '}';
    }
}

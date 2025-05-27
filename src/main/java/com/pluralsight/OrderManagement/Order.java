package com.pluralsight.OrderManagement;

import com.pluralsight.Side.Chip;
import com.pluralsight.Side.Drink;

import java.util.List;

public class Order {

    //    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chip> chips;
    //
    public Order(List<Drink> drinks, List<Chip> chips) {
//            List<Sandwich> sandwiches,
//            this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
    }

    //    public List<Sandwich> getSandwiches() {
    //        return sandwiches;
    //    }
    //
    //    public void setSandwiches(List<Sandwich> sandwiches) {
    //        this.sandwiches = sandwiches;
    //    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public List<Chip> getChips() {
        return chips;
    }

    public void setChips(List<Chip> chips) {
        this.chips = chips;
    }

    public void addDrink(){

    }
    public void addChips(){

    }
    public void totalPrice(){

    }

    public void getOrderDetails(){
        System.out.println(drinks);
        System.out.println(chips);
    };
}

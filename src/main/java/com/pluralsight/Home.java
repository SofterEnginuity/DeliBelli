package com.pluralsight;

import com.pluralsight.order.Chip;
import com.pluralsight.order.Drink;

import java.util.Scanner;

public class Home {


public void displayUserInterface(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("O - Create a new order");
    System.out.println("X - Exit Deli");
    String userInput = scanner.nextLine();
    System.out.println(userInput);

    if(userInput.equalsIgnoreCase("O")){
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
//                  processGetSandwich();
                    break;
                case 2:

                    Chip.getPrice();
//                    processGetChips();
                    System.out.println("Please select a brand of chips");
                    System.out.println("Lays BBQ Chips");
                    System.out.println("Ruffles Potato Chips");
                    System.out.println("Doritos");
                    System.out.println("Cheetos");
                    String userChips = scanner.nextLine();
                    Chip.setBrand(userChips);
//why not working????
                    break;
                case 3:
                    Drink.getPrice();
//                      processGetDrink();
                       break;
//                case 4:
//                    processGetByMakeModelRequest();
//                    break;
//                case 5:
//                    processGetByYearRequest();
//                    break;
//                case 6:
//                    processGetByColorRequest();
//                    break;
//                case 7:
//                    processGetByMileageRequest();
//                    break;
//                case 8:
//                    processGetByVehicleTypeRequest();
//                    break;
//                case 9:
//                    processAddVehicleRequest();
//                    break;
//                case 10:
//                    processRemoveVehicleRequest();
//                    break;
//                case 11:
//                    processGetSalesContract();
//                    break;
//                case 12:
//                    processGetLeaseContract();
//                    break;
                case 0:
                    System.out.println("Thank you for stopping by my dealership");
                    break;
                default:
                    System.out.println("Invalid selection.");
            }

        } while (selection != 0);
    }

//    private void init() {
//        DealershipFileManager fileManager = new DealershipFileManager();
//        this.dealership = fileManager.getDealership();
//
//    }

    }else{
        System.out.println("Exiting Deli..");
    }




}




}


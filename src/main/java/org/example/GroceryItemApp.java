package org.example;

import java.util.Scanner;

public class GroceryItemApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GroceryItem Dunkaroos = new GroceryItem("Dunkaroos", "Snacks", 16, true);
        {

            System.out.println("Welcome to The Grocery Tracker");
            System.out.println("Press 1 to view the details of your item");
            System.out.println("Press 2 to activate a sale on your item");
            System.out.println("Press 3 to exit");
            String userChoice = input.nextLine();

            while (!userChoice.equals("3")) {
                if (userChoice.equals("1")) {
                    System.out.println(Dunkaroos);
                } else if (userChoice.equals("2")) {
                    System.out.println("please enter the sales amount as a decimal");
                    double saleAmount = input.nextDouble();
                    Dunkaroos.activateSale(saleAmount);
                    input.nextLine();
                } else {
                    System.out.println("Sorry invalid command");
                }
                System.out.println("Welcome to The Grocery Tracker");
                System.out.println("Press 1 to view the details of your item");
                System.out.println("Press 2 to activate a sale on your item");
                System.out.println("Press 3 to exit");
                userChoice = input.nextLine();
            }
            System.out.println("Thanks for using GroceryTracker");
        }


    }
}




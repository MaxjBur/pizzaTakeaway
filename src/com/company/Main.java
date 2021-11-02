package com.company;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        boolean y = true;
        double total = 0;
        String toppingchoice;
        ArrayList<String> toppingslist = new ArrayList<>();

        int toppings;
        try {
            while (true) {
                while (x) {
                    System.out.println("What size pizza do you want, 1, 2 or 3?");
                    int size = scanner.nextInt();
                    System.out.println("How many extra toppings ");
                    toppings = scanner.nextInt();
                    if (size == 1) {
                        total = 7.99;
                        x = false;
                    } else if (size == 2) {
                        total = 10.99;
                        x = false;
                    } else if (size == 3) {
                        total = 13.99;
                        x = false;
                    } else {
                        x = false;
                    }
                    for (int i = 0; i < toppings + 1; i++) {
                        System.out.println("What topping would you like?");
                        toppingchoice = scanner.nextLine();
                        toppingslist.add(toppingchoice);

                    }

                    total = total + (1.25 * toppings);
                    System.out.println("your total is £" + total);
                    System.out.println("Your size is " + size + " Your toppings are " + toppingslist);

                }
            }
        } catch (Exception e) {
            System.out.println("Exception occurred " + e);
            scanner.next();
        }


    }
}




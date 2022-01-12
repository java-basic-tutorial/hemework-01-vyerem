package com.softserveinc;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write how many ml of water the coffee machine has:\n >>> ");
        String ingredientwater = scanner.nextLine();

        System.out.print("Write how many ml of milk the coffee machine has:\n >>> ");
        String ingredientmilk = scanner.nextLine();

        System.out.print("Write how many grams of coffee beans the coffee machine has:\n >>> ");
        String ingredientbeans = scanner.nextLine();

        System.out.print("Write how many cups of coffee you will need: \n >>> ");
        String cups = scanner.nextLine();

        int usercups;
        usercups = Integer.parseInt(cups);

        int userwater;
        userwater = Integer.parseInt(ingredientwater);

        int usermilk;
        usermilk = Integer.parseInt(ingredientmilk);

        int userbeans;
        userbeans = Integer.parseInt(ingredientbeans);

        int water;
        water = 200;

        int milk;
        milk = 50;

        int coffeebeans;
        coffeebeans = 15;

        int leftwater;
        leftwater = (userwater - water) / water;
        int leftmilk;
        leftmilk = (usermilk - milk) / milk;
        int leftbeans;
        leftbeans = (userbeans - coffeebeans) / coffeebeans;

        int availablecups;
        availablecups = Math.min(leftwater, Math.min(leftmilk,leftbeans));

        if (availablecups == usercups) {
            System.out.print("Yes, I can make that amount of coffee\n");
        }  else if (userwater < water || usermilk < milk || userbeans < coffeebeans) {
           System.out.print("No, I can make only " + availablecups + " cup(s) of coffee\n");
       } else {
           System.out.print("Yes, I can make that amount of coffee (and even " + availablecups + " more than that)\n");
       }


    }
}

package com.company;
public class Application {

    public static void main(String args[]) {
        Burger.initialize();
        Burger burger = new Burger();
        burger.add("Cheese");
        burger.add("Egg");
        burger.add("Onion");

        double price = burger.getPrice();
        System.out.println("Thank you for ordering :" + burger.getName());
        System.out.println("Your bill amount is :" + burger.getPrice());
    }
}

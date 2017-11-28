import java.io.*;
import java.util.*;
package com.company;

public class Application {

    public static void main(String args[]) {
        Burger burger = new Burger();
        burger.add("Cheese");
        burger.add("Egg");
        burger.add("Onion");

        double price = burger.getPrice();
        System.out.println("Thank you for ordering :" + burger.getName());
        System.out.println("Your amount is :" + burger.getPrice());
    }
}

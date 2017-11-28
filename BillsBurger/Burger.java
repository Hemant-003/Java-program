import java.io.*;
import java.util.*;
package com.company;

public class Burger {

    private static Map<String, Burger> burgerMap = new HashMap<>();

    public static void initialize() {
        burgerMap.put("Egg", new Ingredient("Egg", 20.3));
        burgerMap.put("Onion", new Ingredient("Onion", 6.3));
        burgerMap.put("Garlic", new Ingredient("Garlic", 40.3));
        burgerMap.put("Cheese", new Ingredient("Cheese", 13.1)
        // Read file line by line
    }

    public List<Ingredients> ingredients = new ArrayList<>();

    public void add(String itemName) {
        ingredients.add(burgerMap.get(ingredients));
    }

    public String getName() {
        String name = "";
        /*for(int i=0; i<ingredients.size(); i++) {
            name = name + ingredients.get(i).name + " ";
        }*/
        // Enhanced for loop
        for (Ingredient in : ingredients) {
            name = name + in.name + " ";
        }
        name = name + "burger";
        return name;
    }

    public double getPrice() {
        double price = 0;
        for(Ingredient in : ingredients) {
            price = price + in.price;
        }
        return price;
    }
}

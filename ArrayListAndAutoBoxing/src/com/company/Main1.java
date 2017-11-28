package com.company;

public class Main1 {
    public static void main(String[] args) {
        Phone Nokia = new Phone("Nokia", 6);
        Nokia.balance(50);
        Nokia.number(740553068);
        Nokia.price(5000);
        System.out.println(Nokia.getBrand());
        System.out.println(Nokia.getModel());
    }
}

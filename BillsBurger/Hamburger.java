package com.company;

public class Hamburger {
    public static void main(String[] args) {

        Burgers burgers = new Burgers();
        AdditionalItem additionalItem = new AdditionalItem();
        int total = burgers.BaconBurger();
        total += additionalItem.Bacon();
        System.out.println("total Price = " + total);

    }
    }

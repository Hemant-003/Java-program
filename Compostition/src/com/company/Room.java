package com.company;

public class Room {
    public static void main(String[] args) {

        Door door = new Door("Wooden", 1);
        airConditioner ac = new airConditioner(25, "panasonic", false);

        ac.setTemperature(25);
        ac.inverter(false);
        ac.setBrand("Panasonic");


    }


}
package com.company;
import java.util.Scanner;
public class airConditioner {
    Scanner sc = new Scanner(System.in);
    private int temperature;
    private String brand;
    private boolean inverter;

    public airConditioner(int temperature, String brand, boolean inverter) {

        this.temperature = temperature;
        this.brand = brand;
        this.inverter = inverter;
    }

    public void setTemperature(int temperature){
        if (temperature>16 && temperature<32){
            System.out.println("Temperature of AirConditioner is : " + temperature);
        }
    }
    public int getTemperature() {
            return temperature;
        }

    public  void setBrand(String brand) {
        System.out.println("Brand of Air Conditioner is : " + brand );

    }

    private void isInverter(Boolean inverter) {
        if (inverter == false) {
            System.out.println("There is no inverter");
        }else{
            System.out.println("with inverter");
        }


    }
    public void inverter(boolean condition){
        isInverter(condition);
    }

}
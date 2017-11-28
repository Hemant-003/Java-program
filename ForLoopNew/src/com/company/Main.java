package com.company;

public class Main {

    public static void main(String[] args) {
//        double intrestRate= CalculateIntrest(5000,10);
//        System.out.println("rate of intrest is =" +intrestRate);
        for (double i = 8; i >= 2; i--) {
            System.out.println("intrest" + i + "=" + String.format("%.2f", CalculateIntrest(10000, i)));
        }
    }
    public static double CalculateIntrest(double amount, double intrest) {
        double intrestRate = amount * (intrest / 100);
        return intrestRate;
    }
}


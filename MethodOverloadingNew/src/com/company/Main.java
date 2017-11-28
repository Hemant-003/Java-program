package com.company;

public class Main {

    public static void main(String[] args) {
        CalFeetAndInchesToCentimeteres(10, 5);
        double centimeter=CalFeetAndInchesToCentimeteres(6,0);
        if (centimeter<0){
            System.out.println("invalid parameter");
        }
    }

    public static double CalFeetAndInchesToCentimeteres(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) && (inches <= 12))) {
            return -1;
        }
        double centimeter = (feet * 12) * 2.54;
        centimeter = feet * 2.54;
        System.out.println(feet + " feet " + inches + "inches = " + centimeter + "cm");
        return centimeter;
    }
    }

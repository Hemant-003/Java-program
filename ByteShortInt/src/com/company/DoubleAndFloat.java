    package com.company;

import java.util.Scanner;

public class DoubleAndFloat {

    public static void main(String[] args) {
       double pound;
        double kilogram;
        Scanner sc= new Scanner(System.in);
        pound = sc.nextDouble();
        System.out.println("Enter pound" +pound);
        kilogram=pound*0.4539237d;
        System.out.println("value in kilogram = " +kilogram);
        }
    }


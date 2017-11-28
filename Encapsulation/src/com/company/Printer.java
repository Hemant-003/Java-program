package com.company;
import java.util.Scanner;
public class Printer {
    private String brand;
    private int tonerLevel;
    private boolean duplex;
    private int totalPage;
    Scanner sc = new Scanner(System.in);

    public void printer(String brand, int tonerLevel, boolean duplex, int percentage, int totalPage) {
        this.totalPage=totalPage;
        this.brand = brand;
        this.tonerLevel = tonerLevel;
        if (duplex == true) {
            System.out.println("printer can priint on both the sides");
        } else {
            System.out.println("printer is not duplex");
        }

        if (percentage > 0 && percentage <= 100) {
            this.tonerLevel = tonerLevel + percentage;
            if (tonerLevel > 100) {
                System.out.println("tonner is already full ");


            }


        }

    }
    public int getTonerLevel(){
        return tonerLevel;
    }
    public void PagesPrinter(){
         System.out.println("Enter number of page you want to print  ");
        int PagestoPrint = sc.nextInt();
        if (PagestoPrint > 0 && PagestoPrint <100 ){
            System.out.println("Printing pages ");
        }
    }

    public String getBrand() {
        return brand;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public Scanner getSc() {
        return sc;
    }
}


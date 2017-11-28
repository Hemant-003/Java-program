package com.company;

import java.util.Scanner;

public class Main2 {
 private static Scanner scanner= new Scanner(System.in);
 public static ArrayLis grocerrylist = new ArrayLis();

    public static void main(String[] args) {
        boolean quit = false;
        int choice=0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice :");
            choice = scanner.nextInt();
            switch (choice){
                case 0 : printInstructions();
                case 1 : grocerrylist.PrintItems();
                break;
                case 2 : grocerrylist.AddItem();
                break;
                case 3 : grocerrylist.findItem();
                break;
                case 4 : grocerrylist.modifyItems();
                break;
                case 5 : grocerrylist.removeItem();
                break;
                case 6 : quit = true;
                break;
        }
    }
}
        public static void printInstructions()
        {
                System.out.println("\n Press ");
                System.out.println("\t 1 : To Print item ");
                System.out.println("\t 2 : To add items");
                System.out.println("\t 3 : To Find items");
                System.out.println("\t 4 : To modify item");
                System.out.println("\t 5 : To remove item");
        }
}


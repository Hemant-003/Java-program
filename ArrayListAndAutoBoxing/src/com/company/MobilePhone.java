package com.company;

import java.util.Scanner;

public class MobilePhone {
    public static Scanner scanner = new Scanner(System.in);
    public static ContactList phoneContacts = new ContactList();




    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice :");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    printInstructions();
                case 1:
                    phoneContacts.AddContact();
                    break;
                case 2:
                    phoneContacts.modifyContactNumber();
                    break;
                case 3:
                    phoneContacts.printContactList();
                    break;
                case 4:
                    phoneContacts.queryContactNumber();
                    break;
                case 5:
                    phoneContacts.RemoveContactNumber();
                    break;
                case 6:
                    quit = true;
                    break;
            }


        }
    }
    public static void printInstructions()
    {
        System.out.println("\n Press ");
        System.out.println("\t 1 : To add contact ");
        System.out.println("\t 2 : To modify contact");
        System.out.println("\t 3 : To print contact list");
        System.out.println("\t 4 : To query contact ");
        System.out.println("\t 5 : To delete contact");
    }
}


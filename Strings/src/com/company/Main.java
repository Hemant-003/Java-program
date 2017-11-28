package com.company;

public class Main {

    public static void main(String[] args) {
    String myString = ("This new String ");
    myString= myString + (" is some more");
        System.out.println("String is = " +myString);
        myString = myString + ("\u00A9");
        System.out.println("String is equal to = " +myString);

        String myNumber= ("205");
        myNumber= myNumber + ("48");
        System.out.println("Number string = " +myNumber);

        String myLastNumber = ("88");
        int myint=10;
        myLastNumber= myint + myLastNumber;
        System.out.println("Value is = " +myLastNumber);

        char myChar= ('S');
        myString = myString +  myChar;
        System.out.println("myString = " +myString);

    }
}

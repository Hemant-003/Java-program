package com.company;

public class Fibonnaci1 {

    static int n1 = 0, n2 = 1, n3 = 0;

    static void printFibonnaci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.println(" " + n3);
            printFibonnaci(count - 2);
        }
    }

    public static void main(String[] args)
    {

        System.out.println(n1+ " " +n2);
        printFibonnaci(25-2);
    }
}

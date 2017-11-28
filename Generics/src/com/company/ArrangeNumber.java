package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrangeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i;



        System.out.println("Enter how many number you want to enter ");
        int a = s.nextInt();
        int[] array = new int[a];

        System.out.println("Enter number into array");
        for (i = 0; i < array.length; i++) {
            int b = s.nextInt();

            array[i] = b;
        }

        Odd(array);
        Even(array);
    }
    public static void Odd(int[] array) {
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd.add(array[i]);
            }
        }
        System.out.println("odd number are :");
        for (int i = 0; i < odd.size(); i++) {
            Collections.sort(odd);
            System.out.println(" " +odd.get(i));
        }
    }

    public static void Even(int[] array) {
        ArrayList<Integer> even = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even.add(array[i]);
            }
        }
        System.out.println("Even number are :" );
        for (int i = even.size()-1; i >=0; i--) {
            Collections.sort(even);
            System.out.println(" " + even.get(i));
        }
    }

    public static void printer(int[] array) {
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i]);
        }
    }
}

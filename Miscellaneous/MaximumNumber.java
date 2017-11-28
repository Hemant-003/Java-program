package com.company;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        int input[] = readInput();
         System.out.println("Descending order values are:");
        sortArray(input);
    }

    public static int[] readInput() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length Number :");
        int length = s.nextInt();
        int a[] = new int[length];
        System.out.println("Enter Values for Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();

        }
        return a;
    }

    public static int[] sortArray(int a[]) {
        int temp;
        for (int j = 0; j < a.length; j++) {
            for (int l = j + 1; l < a.length; l++) {
                if ((a[j]) < (a[l])) {
                    temp = a[j];
                    a[j] = a[l];
                    a[l] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        return a;
    }
}

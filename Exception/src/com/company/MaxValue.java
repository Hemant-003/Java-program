package com.company;

import java.util.ArrayList;
import java.util.Scanner;

        class MaxValue {
                public static void main(String[] args) {


                        Scanner s = new Scanner(System.in);
                        System.out.println("enter the size of array");
                        int a = s.nextInt();

                        int[] numbers = new int[a];
                        System.out.println("Enter " + a + " Numbers");
                        for (int i = 0; i < numbers.length; i++) {
                                int b = s.nextInt();
                                numbers[i] = b;
                        }
                        int smallest = numbers[0];
                        int largest = numbers[0];

                        for(int i=1; i< numbers.length; i++)
                        {
                                if(numbers[i] > largest)
                                        largest = numbers[i];
                                else if (numbers[i] < smallest)
                                        smallest = numbers[i];

                        }
                        System.out.println("Largest Number is : " + largest);
                        System.out.println("Smallest Number is : " + smallest);
                }
        }
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int TotalMarks = 100;
        System.out.println("Enter any number = ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if(a<TotalMarks)
        {
            System.out.println("Marks are less than 100");
        }
        if(a > 85)
        {
            System.out.println("Distinction score");
        }
        else {
            System.out.println("Just average");
            // Operator
        }
        {
            int result= 4;
            int previousResult= result - 1;
            System.out.println("Previous result = " +previousResult);

            result = 25 * previousResult;
            previousResult = 25 + result;
            System.out.println("Result = " +previousResult);

            result--;
            result--;
            result--;
            System.out.println("After decrement" +result);

            result *=2+4;
            result +=54;
            result /=2;
            result -=4;
            System.out.println("Result after" +result);

            boolean newResult = true;
            if (newResult == false){
                System.out.println("value is false");
            }
            System.out.println("Enter any value" );
            Scanner ab = new Scanner(System.in);
            int value;
            value = ab.nextInt();
            if (value<90 && value>80){
                System.out.println("Value is above average");
                {
                    int newValue=41;
                    if(newValue<30 || newValue<40){
                        System.out.println("newValue Satisfies both the condition");
                    }

                    boolean car= true;
                    if(car==true) {
                        System.out.println("Value is True");
                    }
                    boolean newCar=true;
                    boolean bigCar = newCar ? true:false;
                    if(newCar = true) {
                        System.out.println("value is false");
                    }
                    double num=20;
                    double num2=80;
                    num2 = ((num+num2)*25);
                    num2=num2%40;
                    if(num2<=20){
                        System.out.println("total was over the limit");
                    }

                }
            }
        }
    }
}

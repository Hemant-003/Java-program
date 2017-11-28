package com.company;
import java.util.Scanner;

class TestClass {
    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);
        int j;

        System.out.println("Enter Number of students already applied for the course");
        int N = s.nextInt();// N Students have already applied
        // courses range from i to c

        System.out.println("EnterNumber of friends");
        int p = s.nextInt(); // Number of Friends

        System.out.println("Enter Number of courses");
        int i = s.nextInt(); //Number of course

        System.out.println("Number of students Enrolled in the course");
        int c = s.nextInt();

        System.out.println("Enter sum of Iq of Last two students");
        int Iq = s.nextInt();
        System.out.println("Enter iq of iTH Stduent");
        int iTH = s.nextInt();
        int y []  = new int [Iq];
        for (j = 0; j<Iq; j++){
            System.out.println("Enter iq of previous student");
            y[j] = s.nextInt();
        }

        int x [] = new int [iTH];
        for(j = 0; j<iTH;j++){
            System.out.println("Enter iq of previous student");
            x[j] = s.nextInt();
        }

        int z = 0;

        for ( j = 1; j < i; i++) {
            if (1 <= i && i <= c) {
              z =  x[j]*y[j];
            }
            System.out.println("Min value is   :" + z);
        }
    }
}



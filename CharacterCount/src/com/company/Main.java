package com.company;

import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter any string");
            String ab=sc.next().toLowerCase();
            System.out.println("Character to count" );
            char bc=sc.next(".").toLowerCase().charAt(0);
            int count=0;
            for (int i=0; i<ab.length();i++ ){
                if(bc==ab.charAt(i)){
                    count++;
                }

            }
            System.out.println(bc +" occur " + count + " time in " +ab );
        }
        }

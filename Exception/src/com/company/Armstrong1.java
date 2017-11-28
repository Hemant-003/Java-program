package com.company;

import java.util.Scanner;

public class Armstrong1 {
    public static void main(String[] args) {
        int a,b,c,temp;
        c = 0;

        Scanner s = new Scanner(System.in);

        a = s.nextInt();
        temp =a;
        while(a>0){
            b = a%10;
            a = a/10;
            c = c + (b*b*b);
        }
        if (temp == c){
            System.out.println("Number is armstrong number");
        }else{
            System.out.println("Number is not armstrong number");
        }
    }

}

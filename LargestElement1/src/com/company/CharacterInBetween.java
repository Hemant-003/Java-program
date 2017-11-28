package com.company;


import java.util.Scanner;

public class CharacterInBetween {
    public static void main(String[]args){
    Scanner a = new Scanner(System.in);

    char b=a.next().charAt(0);
    char c=a.next().charAt(0);

    for (char i=b;i<c;i++){
        System.out.println(i);
    }

       }
}


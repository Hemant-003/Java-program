package com.company;
import java.util.Scanner;

 class ArrayBasics {
    public static void main(String[] args) {
        input(8);
    }

    public static int[] input(int b) {
        Scanner sc= new Scanner(System.in);
        int a[] = new int [b];
        for (int i =0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        for (int j=0;j<a.length;j++) {
            System.out.println(a[j]);
        }


        return a;
    }
}

package com.company;

public class WhileLoop {

    public static void main(String[] args) {
//        int n=2;
//        int count = 1;
//        while (count != 6) {
//            System.out.println("value is =" +count);
//            count++;
//        }
//        for(int i=1; i<=10;i++){
//            n=i*2;
//
//            System.out.println("2* " +i+ "=" + n);
//
//        }}
        int number = 5;
        int finishnumber = 20;
        int evenNumberfound = 0;
        while (number <= finishnumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;

            }
            if (evenNumberfound++ >= 5) {
                break;
            }
            System.out.println("numbber is even " + number);
            number++;
        }
    }





    public static boolean isEvenNumber(int number){
        if (number%2==0) {
            return true;
        }
        else{
            return false;
        }
    }}


package com.company;

import javax.crypto.Mac;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	getInt();
	try{
        Connection con = DriverManager.getConnection("Jdbc:sqlite:C:\\Users\\Ravi\\Programs\\learn-java\\Exception\\testJava.db");
    }catch (SQLException e){
        System.out.println("Something went wrong ");

    }
    }

    private static int getInout(){
        boolean isValid = true;
        System.out.println("Please enter an integer");
        Scanner s = new Scanner(System.in);
        String a = s.next();
        for (int i=0; i<a.length();i++){
            if(!Character.isDigit(a.charAt(i))){
                isValid= false;

            }
        }
        if(isValid){
          return Integer.parseInt(a);
        }
    return 0;
    }

    private static void getInt(){
        Scanner s = new Scanner(System.in);
        int a;
        try {

            System.out.println("Enter any integer");
            a =s.nextInt();
            System.out.println("integer entered is  :" +a) ;
        }
        catch (InputMismatchException e){
            System.out.println("pleas enter integer");
        }
    }
}

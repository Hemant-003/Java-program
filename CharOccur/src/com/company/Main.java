package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("enter any string");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
    }
    public static String ab(String inputString )
    {
           HashMap<Character,Integer> map = new HashMap<Character,Integer>();
           String s=inputString;
           for (int i=0; i<s.length();i++){
               char c = s.charAt(i);
               Integer val = map.get(new Character(c));
               if(val != null) {
                   map.put(c, new Integer(+1));
               }else {
                   map.put(c,1);

               }


        }       return s; }

}

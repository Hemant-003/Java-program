package com.company;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        ArrayList item = new ArrayList();
        item.add(25);
        item.add(25);
        item.add(544);
        item.add(458);

        pritnable(item);

    }
    private static void pritnable(ArrayList a){
        for (Object i : a){
            System.out.println((Integer)i*2);
        }
    }
}

package com.company;

import java.util.ArrayList;

class intClass {
        int value;
         public intClass(int value){
            this.value=value;
        }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {

        return value;
    }
}


    public class Autoboxing {
        public static void main(String[] args) {

            ArrayList<Integer> intClass = new ArrayList<>();
           for (int i=0 ;i <10;i++){
               intClass.add(Integer.valueOf(i));
           }
           for (int i=0; i < 10 ; i++){
               System.out.println( intClass.get(i).intValue());
           }
            ArrayList<Double> doubleClass = new ArrayList<>();
            for (double i = 0.1; i<10.1; i++){
                doubleClass.add(i);
            }
            for (int i = 0; i < doubleClass.size();i++){
                System.out.println(doubleClass.get(i));
            }
        }

}

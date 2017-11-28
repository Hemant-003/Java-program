package com.company;

 public interface telephone {

     void number(double PhoneNumber);
     void balance(int rs);
     void price(int rs);

}

abstract class Number{
     int number(int a,int b){
          int num;
          num=a*b;
          System.out.println(num);
          return num;
     }
}

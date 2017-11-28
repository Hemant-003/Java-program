package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLis {
    Scanner scanner = new Scanner(System.in);

   private ArrayList <String> GroceryList =new  ArrayList<String>();
   int i,position;
   String itemName;


   public void AddItem()
   {
       System.out.println("Enter item name : ");
           String grocery = scanner.next();
           GroceryList.add(grocery);
   }

   public void PrintItems()
   {
       System.out.println("Number of item in list are  " + GroceryList.size());
       for (i = 0; i < GroceryList.size(); i++)
       {
           System.out.println((i + 1) + " . " + GroceryList.get(i));
       }

   }

    public void removeItem() {
        System.out.println("Enter position : ");
        position = scanner.nextInt();
        position = position - 1;
        try {
            GroceryList.remove(position);
            System.out.println("item number " + (position + 1) + " has been removed");
        } catch (IndexOutOfBoundsException e) {
            System.out.println( " Item number is not present in the list ");
        }
    }


    public void modifyItems( ) {

        System.out.println("Enter postion");
        position = scanner.nextInt();
        position = position-1;
        System.out.println("Enter Name");
        itemName= scanner.next();
        {
            GroceryList.set(position , itemName);
            System.out.println("Changed value is + " + GroceryList.get(position));
        }
    }


   public void findItem()
   {
       System.out.println("Enter item you want to find : ");
            itemName= scanner.next();
        if ((GroceryList.contains(itemName))){
           System.out.println("Grocery list contain :" + itemName);
          }
        else {
            System.out.println( "Grocery list does'nt contain item : " + itemName);

        }

   }
}

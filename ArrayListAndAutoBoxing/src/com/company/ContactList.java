package com.company;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactList {

    Scanner scanner = new Scanner(System.in);
    public LinkedHashMap<String, String> ContactList = new LinkedHashMap<>();
    String name,phoneNumber;
    String i;

    public void AddContact()
    {
        System.out.println("Enter name of the contact");
        name = scanner.next();
        System.out.println("Enter phone number of the contact");
        phoneNumber = scanner.next();
        ContactList.put(name,phoneNumber);
    }

    public void RemoveContactNumber()
    {
        System.out.println("Enter name of the contact you want to delete");
        name = scanner.next();
        ContactList.remove(name);
        System.out.println("Contact is deleted");
    }

    public void modifyContactNumber()
    {
        System.out.println("Enter Contact number you want to modify");
         phoneNumber = scanner.next();
        System.out.println("Enter new contact number ");
        String newNumber= scanner.next();
        ContactList.replace(name,phoneNumber,newNumber);
        System.out.println("Contact number is successfully changed");
    }

    public void printContactList() {
        for (Map.Entry<String, String> stringStringEntry : ContactList.entrySet()) {
            int i=1;
                System.out.println((i)+ " .Phone number : " + stringStringEntry.getKey() +
                        " Name :" + stringStringEntry.getValue());
            }
        }

    public void queryContactNumber(){
        System.out.println("Enter name");
        name= scanner.next();
        if (ContactList.containsValue(name)){
            System.out.println(name + " is Present in contact list" );
           }
        else {
            System.out.println("Contact name is not present in the list");
        }
    }

}

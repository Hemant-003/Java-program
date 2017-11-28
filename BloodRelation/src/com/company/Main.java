package com.company;


public class Main {

    public static void main(String[] args) {    BloodGroup("d");
    }


    public static String BloodGroup(String Group){
        String switchvalue=Group;
        switch (Group){
            case "a+":
                System.out.println( "BloodGroup is a");
                break;
            case "a-":
                System.out.println("BloodGroup is a-");
                break;
            case "b+":
                System.out.println("BloodGroup b+ is valid");
                break;
        default:
        System.out.println("blood group is not valid");

}
return Group;
}
}

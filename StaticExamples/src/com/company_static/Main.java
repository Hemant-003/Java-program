package com.company_static;

public class Main {

    public static void main(String[] args) {



        StaticTest first = new StaticTest("1st Instance");
        System.out.println(first.getFirstInstanceName() + " is instance number " + first.getFirstInstancenum());


        StaticTest second   = new StaticTest("second");
        System.out.println(second.getFirstInstanceName() + " is instance " + second.getFirstInstancenum());

        StaticTest third   = new StaticTest("second");
        System.out.println(second.getFirstInstanceName() + " is instance " + second.getFirstInstancenum());


    }
}

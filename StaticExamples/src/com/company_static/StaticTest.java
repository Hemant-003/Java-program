package com.company_static;

public class StaticTest {
    private static int firstInstancenum = 25;
    private String FirstInstanceName;





    public StaticTest( String firstInstanceName) {

        FirstInstanceName = firstInstanceName;

    }



    public int getFirstInstancenum() {
        return firstInstancenum;
    }

    public String getFirstInstanceName() {
        return FirstInstanceName;
    }
}

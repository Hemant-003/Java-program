package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Customer {
    private String name;
    private String IdProof;
    private Date checkInTime;
    private Date CheckOutTime;

    HashMap<Customer, String> customerDetail = new HashMap<Customer, String>();


    public Customer(String name, String IdProof) {
        this.name = name;
        this.IdProof = IdProof;
    }

    public void setcheckInTime() {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); // Now use today date.
        System.out.println(c.getTime());
    }

    public void setCheckOutTime(int daysOfStay) {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date()); // Now use today date.
        c.add(Calendar.DATE, daysOfStay); // adding days
        System.out.println(c.getTime());
    }
}

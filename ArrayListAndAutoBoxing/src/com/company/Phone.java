package com.company;

public class Phone implements  telephone{

    private String model;
    private int brand;

    public Phone(String model,int brand){
        this.brand=brand;
        this.model=model;

    }

    @Override
    public void number
            (double PhoneNumber)
    {
        System.out.println( PhoneNumber);

    }

    @Override
    public void balance(int rs) {

        System.out.println(rs);

    }

    @Override
    public void price(int rs) {
        System.out.println(rs);
    }

    public String getModel() {
        return model;
    }

    public int getBrand() {
        return brand;
    }
}

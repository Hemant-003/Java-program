package com.company;

public class Case {
    private String Model;
    private String manufacture;
    private String powersupply;
    private Dimensions Dimensions;

    public Case(String Model,String manufacture,String powersupply,Dimensions Dimensions){
        this.Model=Model;
        this.manufacture=manufacture;
        this.powersupply=powersupply;
        this.Dimensions=Dimensions;

    }

    public String getModel() {
        return Model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public Dimensions getDimensions() {
        return Dimensions;
    }

    public String getPowersupply() {
        return powersupply;
    }
    public void PressPowerButton(Boolean Command){
        if (Command==true){
            System.out.println("Turning on powerButton");
        }
        else{
            System.out.println("Power Button is off please turn it on");
        }

    }
}

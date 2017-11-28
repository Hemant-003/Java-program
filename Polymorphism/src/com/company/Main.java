package com.company;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4,"Vehicle");
        System.out.println(vehicle.engine());
        System.out.println(vehicle.getName());
        System.out.println(vehicle.accelerated());
        vehicle.Brake();

        Mercedes mercedes= new Mercedes(10,"Mecedes");
        System.out.println(mercedes.engine());
        System.out.println(mercedes.accelerated());
        System.out.println(mercedes.Brake());
        System.out.println(mercedes.getName());

        bmw Bmw = new bmw(15,"BMW");
        System.out.println(Bmw.accelerated());
        System.out.println(Bmw.Brake());
        System.out.println(Bmw.engine());
        System.out.println(Bmw.getName());
    }
}

class Vehicle {
    private int cylinder;
    private boolean engine;
    private int wheels;
    private String Name;
        public Vehicle(int cylinder,String Name){
            this.cylinder=cylinder;
            this.Name=Name;
            this.engine=true;
            this.wheels=4;
        }
    public int Cylinder() {
        return cylinder;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return Name;
    }

    public String engine(){
            return "Start -> engine ";
    }
    public String accelerated() {
        return "Car -> Accelerated";
    }
    public String Brake(){
        return "Car -> Brake";
    }
}


class Mitsubishi extends Vehicle{
    public Mitsubishi(int cylinder,String name){
        super(cylinder,name);
    }

    @Override
    public String engine() {
        return super.engine();
    }

    @Override
    public String accelerated() {
        return super.accelerated();
    }

    @Override
    public String Brake() {
        return super.Brake();
    }
}

class Mercedes extends Vehicle{
    Mercedes(int cylinder,String name){
        super(cylinder,name);
    }

    @Override
    public String engine() {
        return super.engine();
    }

    @Override
    public String accelerated() {
        return super.accelerated();
    }

    @Override
    public String Brake() {
        return super.Brake();
    }
}
class bmw extends Vehicle{
    bmw(int cylinder, String name){
        super(cylinder,name);
    }

    @Override
    public String engine() {
        return super.engine();
    }

    @Override
    public String accelerated() {
        return super.accelerated();
    }

    @Override
    public String Brake() {
        return super.Brake();
    }
}
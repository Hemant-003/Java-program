package com.company;

public class Main {
    public static void main(String[] args){
        Dimensions dimensions= new Dimensions(20,20,5);
        Case theCase= new Case("AcerAspire5742g","Acer","220v",dimensions);

        Monitor monitor= new Monitor("Acer Lap",new Resolution(25,15),19,"5742g");
        Motherboard theMotherboard = new Motherboard("asus","intel",2,2,"V2.4");

        PersonalComputer Pc = new PersonalComputer(theCase,monitor,theMotherboard,"152 key","Asus");
        Pc.getTheMonitor().DrawPixelAt(25,20,"Blue");
        Pc.getMotherboard().LoadingOs("Windows 7");
        Pc.TheCase();
        }
}

package com.company;

public class PrinterFront {
    public static void  main(String[]args){
    Printer printerone = new Printer();
    printerone.printer("Asus",85,true,10,150);
        System.out.println("toner level" + printerone.getTonerLevel());
        System.out.println("brand" + printerone.getBrand());
        System.out.println("total pages" + printerone.getTotalPage());
        System.out.println("duplex" + printerone.isDuplex());
        printerone.PagesPrinter();
    }

}

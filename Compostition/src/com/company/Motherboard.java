package com.company;

public class Motherboard {

    private String motherboardName;
    private int Ram;
    private int cardSlots;
    private String Bios;
    private String Manufacture;

    public Motherboard(String motherboardName,String manufacture,int Ram,int cardSlots,String Bios){
        this.motherboardName=motherboardName;
        this.Manufacture=manufacture;
        this.Ram=Ram;
        this.cardSlots=cardSlots;
        this.Bios=Bios;

    }
        public void LoadingOs(String Os){
            System.out.println(Os + " = Program is loading ");
        }

        public String getMotherboardName() {
        return motherboardName;
        }

        public int getCardSlots() {
        return cardSlots;
        }

        public int getRam() {
        return Ram;
        }

        public String getBios() {
        return Bios;
        }

        public String getManufacture() {
        return Manufacture;
    }
}

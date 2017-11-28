package com.company;

public class Room {
    private float price;
    Room singleRoom;
    Room doubleRoom;




    public float getPrice(Room type) {
        if (type==singleRoom){
            price =400;
        }
        else{
            price=500;
        }
    return  price;
    }
}

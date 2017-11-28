package com.hemant;

public class BoardCell {
    private CellType type;
    BoardCell next;

    public BoardCell(String c) {
        switch (c){
            case "E":type = CellType.EMPTY;break;
            case "J":type = CellType.JAIL;break;
            case "T":type = CellType.TREASURE;break;
            case "H":type = CellType.HOTEL;break;
        }
    }

    public double getPrice() {
        return type.amount;
    }

    @Override
    public String toString() {
        return type.toString();
    }

    public boolean isHotel() {
        return type.equals(CellType.HOTEL);
    }
}



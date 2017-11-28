package com.hemant;

public enum CellType {
    JAIL(-150), TREASURE(250), HOTEL(0), EMPTY(0);

    double amount;
    CellType(double i) {
        this.amount = i;
    }
}

package com.hemant;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Player {
    private double money = 1000d;
    private BoardCell currentCell;
    private char name;
    List<Hotel> possessions = new ArrayList<>();

    public Player(BoardCell start, int i) {
        name = (char) i;
        currentCell = start;
    }


    public void move(int numberOfPositions, Map<BoardCell, Player> playerHotelsMap) {
        for (int i = 0; i < numberOfPositions; i++) {
            currentCell = currentCell.next;
        }
        if (currentCell.isHotel()) {
            if(playerHotelsMap.containsKey(currentCell)){
                Player player = playerHotelsMap.get(currentCell);
                player.money += 50;
                this.money -= 50;
            } else {
                playerHotelsMap.put(currentCell, this);
                money -= 200;
            }
        } else money += currentCell.getPrice();
    }

    @Override
    public String toString() {
        return name + "--" + money;
    }
}

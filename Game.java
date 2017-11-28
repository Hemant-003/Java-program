package com.hemant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
    private BoardCell start;
    private List<Player> players = new ArrayList<>();
    private int numberOfRounds = 2;
    private int currentRound;
    Map<BoardCell, Player> playerHotelsMap = new HashMap<>();
    private String dieInput = "4,4,4" +
            ",6,7,8" +
            ",5,11,10" +
            ",12,2,3" +
            ",5,6,7" +
            ",8,5,11" +
            ",10,12,2" +
            ",3,5,6" +
            ",7,8,5" +
            ",11,10,12";

    public Game(int numberOfPlayers, String cellPositions) {
        BoardCell lastCell = initBoard(cellPositions);
        initPlayers(numberOfPlayers, lastCell);
    }

    private void initPlayers(int numberOfPlayers, BoardCell lastCell) {
        for (int i = 0; i < numberOfPlayers; i++) {
            players.add(new Player(lastCell, 97 + i));
        }
    }

    private BoardCell initBoard(String cellPositions) {
        String[] cells = cellPositions.split(",");
        start = new BoardCell(cells[0]);


        BoardCell temp = start;
        for (int i = 1; i < cells.length; i++) {
            temp.next = new BoardCell(cells[i]);
            temp = temp.next;
        }

        temp.next = start;
        return temp;
    }

    private void printBoard() {
        BoardCell temp;
        temp = start;
        do {
            System.out.println(temp);
            temp = temp.next;
        } while (temp != start);
    }

    public void play() {
        String[] diceValues = dieInput.split(",");
        System.out.println(diceValues.length);

        for (int i = 0; i < diceValues.length; i++) {
            int currentDiceValue = Integer.parseInt(diceValues[i]);
            int currentPlayerIndex = i % players.size();
            players.get(currentPlayerIndex).move(currentDiceValue, playerHotelsMap);
        }
    }

    public void result() {
        System.out.println(playerHotelsMap);
        System.out.println(players);
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int gameScore = 500;
        int levelComleted = 2;
        int bonus = 1000;

            if (gameOver){
                int finalScore= gameScore + (levelComleted*bonus);
                System.out.println("score =" +finalScore);
            }

    }
}

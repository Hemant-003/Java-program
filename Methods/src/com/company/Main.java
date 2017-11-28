package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        CalculateScore( true, 1000, 8, 200   );

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is =" + finalScore);
        }
    }

    public static int CalculateScore(boolean GameOver,int score,int levelCompeted, int bonus){
        int gameScore= score+(levelCompeted*bonus);
        if (GameOver){
            System.out.println("final score is = " +gameScore);

        }
    return gameScore;
    }
}
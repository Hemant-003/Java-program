package com.company;

public class Main {

    public static void main(String[] args) {
        int HighScore = CalculateHighScorePosition(1500);
        displayHighScorePosition("Hemant", HighScore);

        HighScore = CalculateHighScorePosition(900);
        displayHighScorePosition("Ravi", HighScore);

        HighScore = CalculateHighScorePosition(400);
        displayHighScorePosition("Shubham", HighScore);

        HighScore = CalculateHighScorePosition(50);
        displayHighScorePosition("Narendra", HighScore);

    }

    public static void displayHighScorePosition(String playersName, int HighScore) {
        System.out.print(playersName + " managed to get int position " + HighScore);


    }

    public static int CalculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            System.out.println(" score is " + (playerScore));
            return 1;
        } else {
            if (playerScore >= 500 && playerScore < 1000) {
                System.out.println(" score is " + (playerScore));
                return 2;
            } else {
                if (playerScore >= 100 && playerScore < 500) {
                    System.out.println(" score is " + (playerScore));
                    return 3;
                } else {
                    System.out.println(" score is " + (playerScore));
                    return 4;
                }

            }
        }
    }
}
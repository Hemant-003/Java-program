package com.company;
import java.lang.Object;
public class Main {

    public static void main(String[] args) {
    CalculateScore("Hemant" , 500);
    int newScore= CalculateScore("hemant",500);
        System.out.println("score = "+newScore ) ;
    }

    public static int CalculateScore(String player, int score) {
        System.out.println("player " +player+ " scored " +score );
        return score*1000;
    }

    public static int CalculateScore(int score) {
        System.out.println("player scored " +score );
        return score*1000;

    }

}
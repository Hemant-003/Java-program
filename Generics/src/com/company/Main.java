package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        FootballPlayer hemant = new FootballPlayer("Hemant");
        BaseballPlayer ravi = new BaseballPlayer("ravi");
        FootballPlayer dhoni = new FootballPlayer("Dhoni");
        FootballPlayer gambhir = new FootballPlayer("Gambhir");
        FootballPlayer uthapa = new FootballPlayer("Uthapa");
        FootballPlayer narine = new FootballPlayer("Narine");

        Team<FootballPlayer> Csk = new Team<>("Csk");
        Csk.addPlayer(dhoni);
        Csk.addPlayer(hemant);

        Team<FootballPlayer> kkr = new Team<>("Kkr");
        kkr.addPlayer(gambhir);
        kkr.addPlayer(uthapa);
        kkr.addPlayer(narine);


        Team<BaseballPlayer> nY = new Team<>("New Yankees");
        nY.addPlayer(ravi);
        System.out.println(nY.numPlayer());


        kkr.matchResults(Csk,580,500);
        System.out.println("Ranking " + " : " + Csk.ranking()+ " KKr " +kkr.ranking());

        System.out.println(Csk.compareTo(kkr));
    }
}

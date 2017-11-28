package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Teams> {
    String name;

    public League(String name) {
        this.name = name;
    }

    ArrayList<T> league = new ArrayList<>();

    public Boolean addTeamToTheLeage(T Teams) {
        if (league.contains(Teams)) {
            System.out.println("Team already in the team");
            return false;
        } else {
            league.add(Teams);
            System.out.println("Team added to the league");
            return true;
        }


    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());


        }
    }
}

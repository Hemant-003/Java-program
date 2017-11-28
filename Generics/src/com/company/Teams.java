package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.lang.Comparable;


public class Teams <T extends Player> implements Comparable<Teams<T>>{
    String name;
    int won=0;
    int lost=0;
    int tied=0;
    int gamePlayed=0;
    public Teams(String name){
        this.name=name;
    }


    ArrayList <T> teams = new ArrayList<>();

    public String getName() {
        return name;
    }




    // add player to the team

    public Boolean addPlayer(T Player ){
        if (teams.contains(Player)){
            System.out.println(name + " is already in the team");
            return false;
        }else{
            teams.add(Player);
            System.out.println("Member is successfully added to the team");
            return true;
        }
    }

    public void printTeam(){
       Iterator<T> list =  teams.iterator();
       while (list.hasNext()){
           System.out.println(list.next().getName());
       }

    }

    public void matchResults(Teams<T> opponent, int ourScore, int oppScore){
        String message ;
        if (ourScore>oppScore){
            message =" beat ";
            won++;
        }
        else if (ourScore==oppScore){
        message= " drew with ";
        tied++;
        }
        else{
            message = " lost to ";
        lost++;

        }
        gamePlayed++;
        if (opponent != null){
            opponent.matchResults(null,oppScore,ourScore);
            System.out.println( this.getName() + message + opponent.getName());
        }
    }


    public int ranking(){

        return (won*2)+tied;
    }

    @Override
    public int compareTo(Teams<T> teams) {
        if (this.ranking() > teams.ranking()) {
            return 1;
        } else if (this.ranking() < teams.ranking()) {
            return -1;
        } else {
            return 0;
        }
    }
}

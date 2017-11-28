package com.company;

import java.lang.Comparable;
import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    String name;
    int gamePlayed;
    int tied;
    int lost;
    int won;

    ArrayList<T> team= new ArrayList<>();


    public Team(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public boolean addPlayer(T player){
        if (team.contains(player)){
            System.out.println(player + " is already in the team");
            return false;
        }
        else {
            team.add(player);
            System.out.println( player.getName()+ " Is added in the team " + this.name);
            return true;
        }
    }


    public int numPlayer(){
        return team.size();
    }

    public void matchResults(Team <T> opponent, int ourScore,int theirScore){
         String message ;
        if (ourScore>theirScore){
            message =" beat ";
            won++;
        }
        else if (theirScore> ourScore){
            message =" lost to";
            lost++;
        }
        else    {
            message= " drew with";
            tied++;
        }
        gamePlayed++;
        if (opponent != null){
            opponent.matchResults(null,ourScore,theirScore);
            System.out.println(this.getName() + message + opponent.getName());
        }
    }

    public int ranking(){
        return (won*2)+tied;

    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking()>team.ranking()){
            return 1;
        } else if(this.ranking()<team.ranking()){
            return -1;
        }else {
            return 0;
        }

    }
}


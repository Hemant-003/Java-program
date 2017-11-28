package com.company;

public class Player {

    private String name;
    private int hitpoint;
    private String weapon;

    public void Player(String name, int health, String weapon){
        this.name= name;
        if (health >0 && health <=100){
            this.hitpoint = health;
        }
    }

    public void damage(int damage) {
        this.hitpoint = this.hitpoint - damage;
        if (hitpoint <= 0) {
            System.out.println("game is over and score = " + hitpoint);
        }
        else{
            System.out.println(hitpoint);
        }
    }
        public int getHealth(){
            return hitpoint;
    }
    }



package com.example.stickhero;

import java.io.Serializable;

public class Gamescore implements Serializable {
    public int points;
    public int cherries=0;

    public static int highest =0;
    public Gamescore(int x, int y){
        this.points = x;
        this.cherries = y;
    }
    public static Gamescore newGame(){
        Gamescore sc = new Gamescore(0,0);
        return sc;
    }

    public void reset_points(){
        this.points=0;
    }

    public int getPoints() {

        return points;
    }

    public void setPoints(int points) {

        this.points = points;
    }

    public int getCherries() {

        return cherries;
    }

    public void setCherries(int cherries) {
        this.cherries = cherries;
    }
}
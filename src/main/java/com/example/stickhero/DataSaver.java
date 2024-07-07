package com.example.stickhero;

import java.io.Serializable;

public class DataSaver implements Serializable {
    Gamescore score;

    public DataSaver(Player hero, Platform walls, Stick stick, Gamescore score) {
        this.score = score;
    }


}
package com.example.stickhero;


public class SoundManager {

    private String fall;
    private String death;

    private String button;
    private String kick;
    private String death3;
    private String death2;
    private String  dead;
    private String  stickgrowloop;
    private String stickfallen;
    private String  victory;
    private String  score;
    private String  kick_stick;



    public SoundManager() {
        // Load audio files and initialize sound effects
        fall = "fall.wav";
        death ="death.mp3";

        button = "button.wav";
        kick = "kick.wav";
        death3 = "death3.wav";
        death2 = "death2.wav";
        dead = "dead.wav";
        stickgrowloop = "stick_grow_loop.wav";
        stickfallen = "stick_fallen.wav";
        victory = "victory.wav";
        score ="score.mp3";
        death = "death.wav";
        kick_stick = "kick_stick.mp3";
        // Load other sound effects

        // Set volume levels or other configurations if needed

    }



    public String getFall() {
        return fall;
    }

    public String getDeath() {
        return death;
    }

    public String getButton() {
        return button;
    }

    public String getKick() {
        return kick;
    }

    public String getDeath3() {
        return death3;
    }

    public String getDeath2() {
        return death2;
    }

    public String getDead() {
        return dead;
    }

    public String getStickgrowloop() {
        return stickgrowloop;
    }

    public String getStickfallen() {
        return stickfallen;
    }

    public String getVictory() {
        return victory;
    }

    public String getScore() {
        return score;
    }

    public String getKick_stick() {
        return kick_stick;
    }
}
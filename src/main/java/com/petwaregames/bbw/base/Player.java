package com.petwaregames.bbw.base;

public class Player extends Token implements Animated {

    /**
     * Points is always >= 0
     */
    private int points;

    /**
     * Measured as 0 to 100 percent, integer percentage
     */
    private int happiness;

    /**
     * Measured as 0 to 100 percent, integer
     */
    private int sleepiness;


    public Player(int positionX, int positionY) {
        super(positionX, positionY);
    }
}

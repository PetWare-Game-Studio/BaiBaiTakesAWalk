package com.petwaregames.bbw.base;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Player extends Token implements Animated, AcceptsUserInput {

    /**
     * Points is always >= 0
     */
    private int points = 0;

    /**
     * Measured as 0 to 100 percent, integer percentage
     */
    private int happiness = 20;

    /**
     * Measured as 0 to 100 percent, integer
     */
    private int sleepiness = 0;


    public Player(int positionX, int positionY) {
        super(positionX, positionY);
    }


    public void onUserInput(InputEvent event){
        if (event instanceof KeyEvent){
            KeyEvent kev = (KeyEvent)event;
            // every keyboard get has a certain code. get the value of that code from the
            // keyboard event so that we can compare it to KeyEvent constants
            int key = kev.getKeyCode();

            // depending on which arrow key was pressed, we're going to move the player by
            // one whole tile for this input
            if (key == KeyEvent.VK_W) {
                positionY --;
            }
            if (key == KeyEvent.VK_A) {
                positionX --;
            }
            if (key == KeyEvent.VK_S) {
                positionY ++;
            }
            if (key == KeyEvent.VK_D) {
                positionX ++;
            }

        }

    }
}

package com.petwaregames.bbw.base;

/**
 * This is the main game class
 *
 * The game may enforce rules on the Board and its tokens
 */
public class BaiBaiTakesAWalk {

    static long CLOCK_TICK_MILLISECONDS = 50;


    private Board board;

    public void start() {
        System.getLogger(this.getClass().getName()).log(System.Logger.Level.INFO, "game started...");
        board = new Board();
    }
}

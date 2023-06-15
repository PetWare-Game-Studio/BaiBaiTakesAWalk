package com.petwaregames.bbw.base;

import javax.swing.*;

/**
 * This is the main game class
 *
 * The game may enforce rules on the Board and its tokens
 */
public class BaiBaiTakesAWalk extends JFrame {
    public BaiBaiTakesAWalk (String title){
        super(title);
        board = new Board();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    static long CLOCK_TICK_MILLISECONDS = 50;


    private Board board;

    public void start() {
        System.getLogger(this.getClass().getName()).log(System.Logger.Level.INFO, "game started...");

    }
}

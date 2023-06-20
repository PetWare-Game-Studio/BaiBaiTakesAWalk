package com.petwaregames.bbw.base;

import com.petwaregames.bbw.hazard.ExampleHazard;
import com.petwaregames.bbw.player.BaiBai;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * This is the main game class
 *
 * The game may enforce rules on the Board and its tokens
 */
public class BaiBaiTakesAWalk extends JFrame {

    static final int CLOCK_TICK_MILLISECONDS = 50;
    static final String GAME_NAME = "Bai-Bai Takes a Walk";

    private Board board;
    private Player player;
    private Timer timer;


    public BaiBaiTakesAWalk (){
        super(GAME_NAME);

        initUI();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    private void initUI() {

        // Create board
        board = new Board();
        add(board);

        // Add score and message panel
        // TODO - create control panel

        // TODO - Create tokens and add to board
        Token t = new ExampleHazard(1, 1);
        board.addToken(t);

        player = new BaiBai(10, 10);
        board.setPlayer(player);

        setResizable(false);
        pack();


    }



    public void start() {
        System.getLogger(this.getClass().getName()).log(System.Logger.Level.INFO, "game started...");

         // Register the listener for keyboard input
         addKeyListener(new KeyboardInputHandler());

         // Register the listener for timer events
         timer = new Timer(CLOCK_TICK_MILLISECONDS, new TimerHandler());
         timer.start();

    }


    class TimerHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.getLogger(this.getClass().getName()).log(System.Logger.Level.DEBUG, "Clock tick");

            // Forward clock tick to the Board for handling
            board.onClockTick();

            // TODO Get score and other data from player to display
        }
    }

    class KeyboardInputHandler implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            // No implementation required
        }

        @Override
        public void keyPressed(KeyEvent e) {
            System.getLogger(this.getClass().getName()).log(System.Logger.Level.DEBUG, "Key Pressed");
            // Forward user input to board for handling
            board.onUserInput(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // No implementation required
        }
    }
}

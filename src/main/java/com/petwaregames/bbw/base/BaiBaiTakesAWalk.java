package com.petwaregames.bbw.base;

import com.petwaregames.bbw.player.BaiBai;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This is the main game class
 *
 * The game may enforce rules on the Board and its tokens
 */
public class BaiBaiTakesAWalk extends JFrame implements ActionListener {

    private Player player;
    private Board board;

    public BaiBaiTakesAWalk (String title){
        super(title);
        board = new Board();
        board.setPreferredSize(new Dimension(400,400));
        add(board);
        setResizable(false);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    static int CLOCK_TICK_MILLISECONDS = 50;
    private Timer timer;



    public void start() {
        System.getLogger(this.getClass().getName()).log(System.Logger.Level.INFO, "game started...");

         player = new BaiBai(0,0);
         board.setPlayer(player);

         timer = new Timer(CLOCK_TICK_MILLISECONDS, this);
         timer.start();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.getLogger(this.getClass().getName()).log(System.Logger.Level.DEBUG, "Clock tick");
        board.onClockTick();
    }
}

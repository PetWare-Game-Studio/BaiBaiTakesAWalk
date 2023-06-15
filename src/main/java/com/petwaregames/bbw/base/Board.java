package com.petwaregames.bbw.base;

import java.awt.event.KeyEvent;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The Board represents a playing area in which
 * tokens are displayed against a background
 */

public class Board extends JPanel implements Animated {

    /**
     * The Board maintains a list of tokens
     *
     * Tokens may represent players, hazards, or power-ups
     *
     * Tokens are redisplayed on each clock tick
     *
     * Tokens are moved by the board in response to user input,
     * or according to rules enforced by the board itself
     */
    private List<Token> gameTokens = new ArrayList<>();
    private final int DEFAULT_WIDTH = 10;
    private final int DEFAULT_HEIGHT = 10;

    public void addToken(Token token){
        gameTokens.add(token);
    }
    public void removeToken(Token token){
        gameTokens.remove(token);
    }


    public void onClockTick(){
        // this gets called once every tick, before the repainting process happens.
        // so we can do anything needed in here to update the state of the player.
        for (Token token : gameTokens){
            token.onClockTick();
        }

        // prevent the player from moving off the edge of the board sideways
        if (pos.x < 0) {
            pos.x = 0;
        } else if (pos.x >= Board.COLUMNS) {
            pos.x = Board.COLUMNS - 1;
        }
        // prevent the player from moving off the edge of the board vertically
        if (pos.y < 0) {
            pos.y = 0;
        } else if (pos.y >= Board.ROWS) {
            pos.y = Board.ROWS - 1;
        }

        for (Token token : gameTokens){
            token.draw()
        }
    }


    public void onPlayerInput(){
        // prevent the player from disappearing off the board
        player.tick();

        // give the player points for collecting coins
        collectCoins();

        // calling repaint() will trigger paintComponent() to run again,
        // which will refresh/redraw the graphics.
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // this is not used but must be defined as part of the KeyListener interface
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // react to key down events
        player.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // react to key up events
    }
}

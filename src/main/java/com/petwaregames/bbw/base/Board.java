package com.petwaregames.bbw.base;

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

/**
 * The Board represents a playing area in which
 * tokens are displayed against a background
 */

public class Board extends JPanel implements Animated, AcceptsUserInput {

    static final int TILE_SIZE = 50;
    static final int ROWS = 15;
    static final int COLS = 15;

    /**
     * The Board maintains a list of tokens
     * <p>
     * Tokens may represent players, hazards, or power-ups
     * <p>
     * Tokens are redisplayed on each clock tick
     * <p>
     * Tokens are moved by the board in response to user input,
     * or according to rules enforced by the board itself
     */
    private List<Token> gameTokens = new ArrayList<>();

    public void addToken(Token token) {
        gameTokens.add(token);
    }

    public void removeToken(Token token) {
        gameTokens.remove(token);
    }

    /**
     * Phase 1 - The Board has a single player, which moves and
     * acts according to user input
     */

    private Player player;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    public Board() {
        super(false);  // NOT double buffered
        setPreferredSize(new Dimension(TILE_SIZE * COLS, TILE_SIZE * ROWS));
        setBackground(new Color(181, 230, 29));  // Lime green

    }


    public void onClockTick() {
        // this gets called once every tick, before the repainting process happens.
        // so that the board and its tokens can update their state before the
        // next redisplay


        // Give tokens a chance to adjust themselves depending on time
        for (Token token : gameTokens) {
            token.onClockTick();
        }

        player.onClockTick();


        repaint();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        drawBackground(g2d);
        drawTokens(g2d);
        drawPlayer(g2d);
    }

    private void drawPlayer(Graphics2D g2d) {
        player.draw(g2d);
    }

    private void drawTokens(Graphics2D g2d) {

        for (Token t : gameTokens) {
            t.draw(g2d);
        }
    }

    private void drawBackground(Graphics2D g2d) {
        Image image = ImageCache.getImage("background");

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                g2d.drawImage((BufferedImage) image, null, i * TILE_SIZE, j * TILE_SIZE);
            }
        }
    }

    public void onUserInput(InputEvent event) {

        // Forward event to player to move or act
        player.onUserInput(event);

        // prevent the player from disappearing off the board
        confinePlayerToBoard();

//        // TODO See if player has landed on a token
//        // If so, interact with the token
//
//        for (Token t: gameTokens){
//            if (playerLandsOn(t)){
//                interact(player, t);
//            }
//        }

        // Schedule a refresh/redraw of board graphics.

        repaint();
    }

    void confinePlayerToBoard(){
        // prevent the player from moving off the edge of the board sideways
        if (player.positionX < 0) {
            player.positionX = 0;
        } else if (player.positionX >= Board.COLS) {
            player.positionX = Board.COLS - 1;
        }
        // prevent the player from moving off the edge of the board vertically
        if (player.positionY < 0) {
            player.positionY = 0;
        } else if (player.positionY >= Board.ROWS) {
            player.positionY = Board.ROWS - 1;
        }


    }
}



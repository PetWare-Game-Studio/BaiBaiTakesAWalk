package com.petwaregames.bbw.base;

import java.util.ArrayList;
import java.util.List;

/**
 * The Board represents a playing area in which
 * tokens are displayed against a background
 */

public class Board implements Animated {

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

    public void addToken(Token token){
        gameTokens.add(token);
    }
    public void removeToken(Token token){
        gameTokens.remove(token);
    }

    public void onClockTick(){

    }

    public void onPlayerInput(){

    }

}

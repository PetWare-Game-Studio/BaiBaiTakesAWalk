package com.petwaregames.bbw.base;

public class Token {

    /**
     * Each token has a short name which may be displayed by the board
     *
     * In version 1.0, the short name should be no more than 20 characters
     */
    private String name;

    /**
     * Each token has a long description
     */

    private String description;

    /**
     * Each token has a current location in the board coordinate system
     */
    private int positionX, positionY;

    /**
     * Each token has a primary image file, which may be displayed
     * on the board
     *
     * In version 1.0, image files must be 50x50 pixel PNG or GIF files
     */
    private String imageFileName;

    /**
     * Each token has a primary sound file, which may be played
     * by the board
     *
     * In version 1.0, sound files must be no longer than 2 seconds in length,
     * and encoded as WAV files with CDROM quality.
     */
    private String soundFileName;



}

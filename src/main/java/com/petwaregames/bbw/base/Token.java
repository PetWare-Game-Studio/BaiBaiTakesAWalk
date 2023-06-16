package com.petwaregames.bbw.base;

public class Token implements Animated {

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
    private int positionX;
    private int positionY;

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

    public Token(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    protected void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected void setDescription(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }

    public String getSoundFileName() {
        return soundFileName;
    }

    public void setSoundFileName(String soundFileName) {
        this.soundFileName = soundFileName;
    }
}

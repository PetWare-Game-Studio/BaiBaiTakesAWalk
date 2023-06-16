package com.petwaregames.bbw.base;

public abstract class PowerUp extends Token implements Animated {
    public PowerUp(int positionX, int positionY) {
        super(positionX, positionY);
    }
    public abstract Interaction interactWithPlayer(Interaction fromPlayer);
}

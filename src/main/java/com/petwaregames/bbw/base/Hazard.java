package com.petwaregames.bbw.base;

public abstract class Hazard extends Token implements Animated {

    public Hazard(int positionX, int positionY) {
        super(positionX, positionY);
    }

    public abstract Interaction interactWithPlayer(Interaction fromPlayer);

}

package com.petwaregames.bbw.player;

import com.petwaregames.bbw.base.Player;

import java.awt.event.InputEvent;

public class BaiBai extends Player {

    public BaiBai(int positionX, int positionY) {
        super(positionX, positionY);
        setName("Bai-Bai");
        setDescription("The Hero of our story!");
        setImageFileName("BaiBai_BrightEyed_50x50.png");
    }

    @Override
    public void onClockTick() {
        super.onClockTick();
    }

    @Override
    public void onUserInput(InputEvent event) {
        super.onUserInput(event);
    }
}

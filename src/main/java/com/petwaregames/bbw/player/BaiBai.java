package com.petwaregames.bbw.player;

import com.petwaregames.bbw.base.Player;

public class BaiBai extends Player {

    public BaiBai(int positionX, int positionY) {
        super(positionX, positionY);
        setName("Bai-Bai");
        setDescription("The Hero of our story!");
    }

    @Override
    public void onClockTick() {
        super.onClockTick();
    }
}

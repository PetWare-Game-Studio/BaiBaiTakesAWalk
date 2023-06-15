package com.petwaregames.bbw.powerup;

import com.petwaregames.bbw.base.Interaction;
import com.petwaregames.bbw.base.PowerUp;

public class ExtraPaws extends PowerUp {
    @Override
    public void onClockTick() {
        // Not animated


    }

    @Override
    public Interaction interactWithPlayer(Interaction fromPlayer) {

        Integer percentHappiness = (Integer)fromPlayer.get("consume");

        Interaction toPlayer = new Interaction();
        toPlayer.put("happiness", Integer.valueOf(20));

        return toPlayer;
    }

}

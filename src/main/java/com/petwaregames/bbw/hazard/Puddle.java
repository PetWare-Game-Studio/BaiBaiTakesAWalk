package com.petwaregames.bbw.hazard;

import com.petwaregames.bbw.base.Hazard;
import com.petwaregames.bbw.base.Interaction;

public class Puddle extends Hazard {

    public Puddle(int positionX, int positionY) {
        super(positionX, positionY);
    }

    @Override
    public void onClockTick() {
        // Not animated
    }

    @Override
    public Interaction interactWithPlayer(Interaction fromPlayer) {

        Integer percentReduced = (Integer) fromPlayer.get("wet");

        Interaction toPlayer = new Interaction();
        toPlayer.put("percent", Integer.valueOf(-20));

        return toPlayer;
    }
}

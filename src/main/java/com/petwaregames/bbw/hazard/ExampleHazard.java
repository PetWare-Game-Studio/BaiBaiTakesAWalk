package com.petwaregames.bbw.hazard;

import com.petwaregames.bbw.base.Hazard;
import com.petwaregames.bbw.base.Interaction;

public class ExampleHazard extends Hazard {

    public ExampleHazard(int positionX, int positionY) {
        super(positionX, positionY);
    }

    @Override
    public void onClockTick() {
        // Not animated


    }

    @Override
    public Interaction interactWithPlayer(Interaction fromPlayer) {

        Integer percentEaten = (Integer)fromPlayer.get("eat");

        Interaction toPlayer = new Interaction();
        toPlayer.put("points", Integer.valueOf(-100));

        return toPlayer;
    }
}

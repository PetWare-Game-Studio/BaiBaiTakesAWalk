package com.petwaregames.bbw.hazard;


import com.petwaregames.bbw.base.Hazard;
import com.petwaregames.bbw.base.Interaction;

public class Vegetable extends Hazard {

    @Override
    public void onClockTick() {
        // Not animated
    }

    @Override
    public Interaction interactWithPlayer(Interaction fromPlayer) {
        String eatenVegetable = (String) fromPlayer.get("consume");

        Interaction toPlayer = new Interaction();


        if ("cucumber".equalsIgnoreCase(eatenVegetable)) {
            toPlayer.put("Sleepiness", Integer.valueOf("100"));
        }

        return toPlayer;
    }
}


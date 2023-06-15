package com.petwaregames.bbw.hazard;

import com.petwaregames.bbw.base.Hazard;
import com.petwaregames.bbw.base.Interaction;

public class Pests extends Hazard {
    // position int x and y

    public Pests(int x, int y){
        super(x,y);
    }

    @Override
    public void onClockTick() {
        // Not animated

        //System.getLogger(this.getClass().getName()).log(System.Logger.Level.INFO, "Pests received clock tick");
    }

    @Override
    public Interaction interactWithPlayer(Interaction fromPlayer) {

        Integer percentAttacked = (Integer)fromPlayer.get("You have been attacked");

        Interaction toPlayer = new Interaction();
        toPlayer.put("points", Integer.valueOf(-25));

        return toPlayer;
    }
}

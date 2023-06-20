package com.petwaregames.bbw.hazard;

import com.petwaregames.bbw.base.Hazard;
import com.petwaregames.bbw.base.Interaction;
import com.petwaregames.bbw.base.Sound;

public class ExampleHazard extends Hazard {

    public ExampleHazard(int positionX, int positionY) {
        super(positionX, positionY);
        setName("YuckyStuff");
        setDescription("This is a pile of yucky stuff that smells pretty good");
    }

    int clockTicks = 0;

    @Override
    public void onClockTick() {
        if (++clockTicks % 20 != 0) return;

        clockTicks = 0;

        // Swap images
        // TODO - FIX this - detecting which image is displayed by checking the filename is clumsy
        if (getImageFileName().equals("ExampleHazard_poo_1_50x50.png")){
            setImageFileName("ExampleHazard_poo_2_50x50.png");
        }
        else {
            setImageFileName("ExampleHazard_poo_1_50x50.png");
        }

    }


    @Override
    public Interaction interactWithPlayer(Interaction fromPlayer) {

        String action = (String)fromPlayer.get("action");
        String playerName = (String)fromPlayer.get("name");


        Interaction toPlayer = new Interaction();

        new Sound("ExampleHazard_bleah_44100.wav").playInBackground();

        switch(action) {
            case "touch" -> toPlayer.put("points", Integer.valueOf(-10));
            case "sniff" -> toPlayer.put("points", Integer.valueOf(-20));
            case "taste" -> toPlayer.put("points", Integer.valueOf(-30));
            case "eat" -> toPlayer.put("points", Integer.valueOf(-100));
        }
        toPlayer.put("description", "Oh no!  The " + getName() + " poisoned " + playerName + "!" );

        return toPlayer;
    }
}

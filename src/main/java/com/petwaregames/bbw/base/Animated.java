package com.petwaregames.bbw.base;

public interface Animated {
    default void onClockTick(){
        // Change state of the object in response to a clock tick
        System.getLogger(this.getClass().getName()).log(System.Logger.Level.DEBUG, "Object received clock tick");
    }
}

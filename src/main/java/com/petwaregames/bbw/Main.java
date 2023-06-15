package com.petwaregames.bbw;

import com.petwaregames.bbw.base.BaiBaiTakesAWalk;

public class Main {
    public static void main(String[] args) {
        System.getLogger("Main").log(System.Logger.Level.INFO, "main entered");

        new BaiBaiTakesAWalk().start();
    }
}

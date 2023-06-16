package com.petwaregames.bbw;

import com.petwaregames.bbw.base.BaiBaiTakesAWalk;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {

        System.getLogger("Main").log(System.Logger.Level.INFO, "main entered");

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BaiBaiTakesAWalk("BaiBai Takes A Walk!").start();
            }
        });

    }
}

package com.tlotrintf.app.game.utils;

import java.util.Random;

public class Dice {
    
    private static Random rn = new Random();

    public static int throwDice(int limit){
        return rn.nextInt(limit);
    }
}
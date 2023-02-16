package com.tlotrintf.app;

import Game.LordOfTheRings;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LordOfTheRings myGame = new LordOfTheRings();
        myGame.setup();
        myGame.execute();
    }
}

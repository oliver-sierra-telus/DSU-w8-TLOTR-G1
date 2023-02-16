package com.tlotrintf.app.Game.creatures;

import com.tlotrintf.app.Game.utils.Dice;

public abstract class Beast extends Creature{

    public Beast(String name, int shieldResistance) {
        super(name, shieldResistance);
    }

    @Override
    public boolean isHeroe(){
        return false;
    }

    @Override
    public int throwDices(){
        return Dice.throwDice(90);
    }
}
package com.tlotrintf.app.game.creatures;

import com.tlotrintf.app.game.utils.Dice;

public abstract class Beast extends Creature {

    public Beast(String name, int shieldResistance) {
        super(name, shieldResistance);
    }

    @Override
    public int throwDices() {
        return Dice.throwDice(90);
    }
}
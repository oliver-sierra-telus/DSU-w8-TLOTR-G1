package com.tlotrintf.app.game.creatures;

import com.tlotrintf.app.game.utils.Dice;

public abstract class Heroe extends Creature implements isHeroe{    

    public Heroe(String name, int shieldResistance) {
        super(name, shieldResistance);
    }

    @Override
    public boolean isHeroe(){
        return true;  
    }

    @Override
    public int throwDices() {
        int firstDice = Dice.throwDice(100);
        int secondDice = Dice.throwDice(100);
        return Math.max(firstDice, secondDice);
    }
}
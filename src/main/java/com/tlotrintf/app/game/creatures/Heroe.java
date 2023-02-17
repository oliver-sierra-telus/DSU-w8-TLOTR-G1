package com.tlotrintf.app.game.creatures;

import com.tlotrintf.app.game.utils.Dice;

<<<<<<< HEAD
public abstract class Heroe extends Creature implements Dices {
=======
public abstract class Heroe extends Creature implements Dices, isHeroe{
>>>>>>> f4d5346916d8f4141abf2aaa443dbadfed29409c
    

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
package com.tlotrintf.app.game.creatures;

import com.tlotrintf.app.game.utils.Creatures.Types;

public abstract class Creature {
    
    protected String name;
    protected int lifePoints;
    protected int shieldResistance;

    public Creature(String name, int shieldResistance){
        this.name = name;
        this.shieldResistance = shieldResistance;
    }

<<<<<<< HEAD
    public abstract boolean isHeroe();

=======
>>>>>>> f4d5346916d8f4141abf2aaa443dbadfed29409c
}
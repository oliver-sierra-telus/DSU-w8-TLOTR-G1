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

    public abstract boolean isHeroe();

    public abstract int throwDices();

    public abstract int getLifePoints();

    public abstract int getShieldResistance();

    public abstract void setNewLifePoints(int damage);

    public abstract int attackOpponent(Creature Character);

    public abstract Types getCharacterType();

    public String getName() {
        return this.name;
    }
}
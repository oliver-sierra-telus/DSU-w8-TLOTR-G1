package com.tlotrintf.app.game.creatures;


public abstract class Creature implements GeneralBehaviour{
    
    protected String name;
    protected int lifePoints;
    protected int shieldResistance;

    public Creature(String name, int shieldResistance){
        this.name = name;
        this.shieldResistance = shieldResistance;
    }
}
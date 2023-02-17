package com.tlotrintf.app.game.creatures;

import com.tlotrintf.app.game.utils.Creatures.Types;

public class Human extends Heroe implements GeneralBehaviour {

    public Human(String name, int shieldResistance) {
        super(name, shieldResistance);
        this.name = name;
        lifePoints = 180;
        this.shieldResistance = shieldResistance;

    }

    @Override
    public int getLifePoints() {
        if(lifePoints <= 0)
            return 0;
        return this.lifePoints;
    }

    @Override
    public int getShieldResistance() {
        return this.shieldResistance;
    }

    @Override
    public void setNewLifePoints(int damage) {
        this.lifePoints -= damage;
    }

    @Override
    public int attackOpponent(Creature character) {
        return 0;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public Types getCharacterType() {
        return Types.HUMAN;
    }   
}
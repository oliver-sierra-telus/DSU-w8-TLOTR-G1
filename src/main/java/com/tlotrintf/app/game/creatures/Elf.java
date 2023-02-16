package com.tlotrintf.app.game.creatures;

import com.tlotrintf.app.game.utils.Creatures.Types;

public class Elf extends Heroe{

    public Elf(String name, int shieldResistance) {
        super(name, shieldResistance);
        this.name = name;
        lifePoints = 250;
        this.shieldResistance = shieldResistance;
    }

    @Override
    public boolean fears() {
        return false;
    }


    @Override
    public int getLifePoints(){
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

    // si elfo ataca 
    @Override
    public int attackOpponent(Creature creature) {
        // si el oponente es un orco incrementa su potencia ofensiva en 10 unidades. 
        if(creature.getCharacterType() == Types.ORC) {
            return 10;
        }
        return 0;
    }

    @Override
    public Types getCharacterType() {
        return Types.ELF;
    }
}
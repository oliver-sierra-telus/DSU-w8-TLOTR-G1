package com.tlotrintf.app.game.creatures;

import com.tlotrintf.app.game.utils.Creatures.Types;

public class Elf extends Heroe implements CreatureHates{

    public Elf(String name, int shieldResistance) {
        super(name, shieldResistance);
        this.name = name;
        lifePoints = 250;
        this.shieldResistance = shieldResistance;
    }

    @Override
    public boolean hates() {
        return true;
    }

    @Override
    public int getLifePoints(){
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
    public int attackOpponent(Creature creature) {
        if(this.hates() && creature.getCharacterType() == Types.ORC) {
            return 10;
        }
        return 0;
    }

    @Override
    public Types getCharacterType() {
        return Types.ELF;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
package com.tlotrintf.app.game.creatures;

import com.tlotrintf.app.game.utils.Creatures.Types;

public class Hobbit extends Heroe implements GeneralBehaviour, CreatureFears{

    public Hobbit(String name, int shieldResistance) {
        super(name, shieldResistance);
        this.name = name;
        lifePoints = 200;
        this.shieldResistance = shieldResistance;
    }

    @Override
    public boolean fears() {
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
        // estos personajes tienen un miedo especial a los goblins (trasgos) por lo que siempre que se enfrenten
        // perderan 5 unidades en su potencia ofensiva
        if(this.fears() && creature.getCharacterType() == Types.GOBLIN) {
            return -5;
        }
        return 0;
    }

    @Override
    public Types getCharacterType() {
        return Types.HOBBIT;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
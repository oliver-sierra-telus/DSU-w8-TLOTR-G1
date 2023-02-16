package com.tlotrintf.app.game.creatureFactory;

import com.tlotrintf.app.game.creatures.Creature;
import com.tlotrintf.app.game.creatures.Goblin;
import com.tlotrintf.app.game.creatures.Orc;


public class BeastsFactory implements AbstractCreaturerFactory{

    @Override
    public Creature createCreature(int type,String name,int shieldResistance) {
        Creature myCharacter = switch (type) {
            case 4 -> new Orc(name,shieldResistance);
            case 5 -> new Goblin(name,shieldResistance);
            default -> null;
        };
        return myCharacter;
    }
}
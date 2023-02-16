package com.tlotrintf.app.Game.creatureFactory;

import com.tlotrintf.app.Game.creatures.Creature;
import com.tlotrintf.app.Game.creatures.Goblin;
import com.tlotrintf.app.Game.creatures.Orc;

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
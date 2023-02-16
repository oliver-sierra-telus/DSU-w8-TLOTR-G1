package com.tlotrintf.app.Game.creatureFactory;

import com.tlotrintf.app.Game.creatures.Creature;
import com.tlotrintf.app.Game.creatures.Elf;
import com.tlotrintf.app.Game.creatures.Hobbit;
import com.tlotrintf.app.Game.creatures.Human;

public class HeroesFactory implements AbstractCreaturerFactory {

    @Override
    public Creature createCreature(int type,String name,int shieldResistance) {
        Creature myCharacter = switch (type) {
            case 1 -> new Human(name,shieldResistance);
            case 2 -> new Elf(name,shieldResistance);
            case 3 -> new Hobbit(name,shieldResistance);
            default -> null;
        };
        return myCharacter;
    } 
}
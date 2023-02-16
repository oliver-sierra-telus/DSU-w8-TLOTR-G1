package com.tlotrintf.app.game.creatureFactory;

import com.tlotrintf.app.game.creatures.Creature;
import com.tlotrintf.app.game.creatures.Elf;
import com.tlotrintf.app.game.creatures.Hobbit;
import com.tlotrintf.app.game.creatures.Human;

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
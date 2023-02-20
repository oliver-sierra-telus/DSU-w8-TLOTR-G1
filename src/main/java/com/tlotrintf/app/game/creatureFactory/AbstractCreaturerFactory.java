package com.tlotrintf.app.game.creatureFactory;

import com.tlotrintf.app.game.creatures.Creature;

public interface AbstractCreaturerFactory {
    
    public Creature createCreature(int type, String name, int shieldResistance);
}
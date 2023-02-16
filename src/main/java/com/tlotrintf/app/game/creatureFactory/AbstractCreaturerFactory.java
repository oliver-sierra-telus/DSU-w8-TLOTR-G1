package com.tlotrintf.app.Game.creatureFactory;

import com.tlotrintf.app.Game.creatures.Creature;

public interface AbstractCreaturerFactory {
    
    public Creature createCreature(int type, String name, int shieldResistance);
}
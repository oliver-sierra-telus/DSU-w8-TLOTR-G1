package com.tlotrintf.app.game.creatures;

import com.tlotrintf.app.game.utils.Creatures.Types;

public interface GeneralBehaviour {
    
    int getLifePoints();

    int getShieldResistance();

    void setNewLifePoints(int damage);

    int attackOpponent(Creature creature);

    Types getCharacterType();

    String getName();
}

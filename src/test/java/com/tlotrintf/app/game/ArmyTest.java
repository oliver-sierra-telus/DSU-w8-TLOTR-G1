package com.tlotrintf.app.game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tlotrintf.app.game.creatures.Creature;
import com.tlotrintf.app.game.creatures.Elf;

public class ArmyTest {
    @Test
    public void testInsertIntoArmy() {
        Army army = new Army("Hero", 1);
        Creature newHero = new Elf("Elf", 50);
        army.insertIntoArmy(newHero);

        assertEquals(1, army.getArmySize());
    }
}

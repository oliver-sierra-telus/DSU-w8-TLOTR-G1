package com.tlotrintf.app.game.creatureFactory;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.tlotrintf.app.game.creatures.Creature;
import com.tlotrintf.app.game.utils.Creatures.Types;

public class BeastsFactoryTest {
    
    AbstractCreaturerFactory myFactory;

    @Before
    public void setUp() {
        myFactory = new BeastsFactory();
    }

    
        @Test
        public void createOrcCreature() {
            Creature myCreature = myFactory.createCreature(4, "orc", 50);
            assertTrue(myCreature.getCharacterType() == Types.ORC);
        }
    
        @Test
        public void createGoblinCreature() {
            Creature myCreature = myFactory.createCreature(5, "goblin", 50);
            assertTrue(myCreature.getCharacterType() == Types.GOBLIN);
        }
    
}

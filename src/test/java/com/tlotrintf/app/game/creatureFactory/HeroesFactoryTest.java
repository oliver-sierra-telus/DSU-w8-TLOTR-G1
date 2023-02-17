package com.tlotrintf.app.game.creatureFactory;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.tlotrintf.app.game.creatures.Creature;
import com.tlotrintf.app.game.utils.Creatures.Types;

public class HeroesFactoryTest {

    AbstractCreaturerFactory myFactory;

    @Before
    public void setUp() {
        myFactory = new HeroesFactory();
    }

    @Test
    public void createHumanCreature() {
        Creature myCreature = myFactory.createCreature(1, "human", 50);
        assertTrue(myCreature.getCharacterType() == Types.HUMAN);
    }

    @Test
    public void createElfCreature() {
        Creature myCreature = myFactory.createCreature(2, "human", 50);
        assertTrue(myCreature.getCharacterType() == Types.ELF);
    }

    @Test
    public void createHobbitCreature() {
        Creature myCreature = myFactory.createCreature(3, "human", 50);
        assertTrue(myCreature.getCharacterType() == Types.HOBBIT);
    }

    @Test
    public void cannotCreateBeastCreature() {
        Creature myCreature = myFactory.createCreature(4, "beast", 50);
        assertNull(myCreature);    
    }
}

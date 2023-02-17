package com.tlotrintf.app.game;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.tlotrintf.app.game.creatureFactory.AbstractCreaturerFactory;
import com.tlotrintf.app.game.creatureFactory.BeastsFactory;
import com.tlotrintf.app.game.creatureFactory.HeroesFactory;

public class LordOfTheRingsTest {
    
    Army heroeArmy; 
    Army beastArmy; 
    AbstractCreaturerFactory heroeFactory;
    AbstractCreaturerFactory beastFactory;

    @Before                                        
    public void setUp() {
        heroeFactory = new HeroesFactory();
        beastFactory = new BeastsFactory();
        heroeArmy = new Army("HEROES ARMY", 1);
        beastArmy = new Army("BEASTS ARMY", 1);
    }

    @Test
    public void insertIntoBeastArmy() {
        beastArmy.insertIntoArmy(beastFactory.createCreature(4, "orco", 50));
        assertTrue(beastArmy.getArmySize() != 0);
    }

    @Test
    public void insertIntoHeroeArmy() {
        heroeArmy.insertIntoArmy(heroeFactory.createCreature(2, "orco", 50));
        assertTrue(heroeArmy.getArmySize() != 0);
    }

    @Test
    public void CannotInsertIntoArmyMoreThanAllowed() {
        heroeArmy.insertIntoArmy(heroeFactory.createCreature(2, "Elf", 50));
        assertTrue("Cant add another heroe", heroeArmy.getArmySize() < 2);
    }
}

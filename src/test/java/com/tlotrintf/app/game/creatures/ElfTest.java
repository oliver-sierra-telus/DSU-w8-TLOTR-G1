package com.tlotrintf.app.game.creatures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ElfTest {
    Elf elf = new Elf("elf", 50);

    @Test
    public void testGetLifePoints() {
        assertEquals(250, elf.getLifePoints());
    }

    @Test
    public void testGetShieldResistance() {
        assertEquals(50, elf.getShieldResistance());
    }
}

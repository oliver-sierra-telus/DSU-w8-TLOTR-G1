package com.tlotrintf.app.game;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class CombatHistoryTest {
    @Test
    public void testShowCombatHistory() {
        
        Army armyHeroes = new Army("Heroes Army", 50);
        CombatHistory combatHistory = mock(CombatHistory.class);

        doNothing().when(combatHistory).showCombatHistory(armyHeroes);
        combatHistory.showCombatHistory(armyHeroes);

        verify(combatHistory, times(1)).showCombatHistory(armyHeroes);

    }
}

package com.tlotrintf.app.game;


import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.mock.*;

@RunWith(MockitoJUnitRunner.class)
public class TurnTest {
    
    @Test
    public void testCombat() {
        // Army heroeArmy = new Army("Hero", 2);
        // Army beastArmy = new Army("Beast", 2);
        Turn turn = mock(Turn.class);
        
        verify(turn,atLeastOnce()).combat();
        
    }
}
package com.tlotrintf.app.game;


import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TurnTest {
    
    @Test
    public void testCombat() {

        Turn turn = mock(Turn.class);
        
        doNothing().when(turn).combat();
        turn.combat();

        verify(turn,atLeastOnce()).combat();
        
    }
}
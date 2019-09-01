package com.brainfuck.datamodel;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellsTest {
    Cells cells = Cells.getInstance();
    @Test
    public void testMoveForwardAndBackward(){
        cells.moveforward();
        cells.moveforward();
        int currentPointer= cells.getPointer();
        assertEquals(2,currentPointer);
        cells.movebackward();
        currentPointer = cells.getPointer();
        assertEquals(1,currentPointer);
    }
    @Test
    public void testIncrementAndDecrement() {
        cells.increment();
        cells.increment();
        cells.increment();
        cells.increment();
        int currentNumberOfBytes = cells.getCurrentElement();
        assertEquals(4, currentNumberOfBytes);

        cells.decrement();
        cells.decrement();
        currentNumberOfBytes = cells.getCurrentElement();
        assertEquals(2, currentNumberOfBytes);
    }
}

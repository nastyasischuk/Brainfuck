package com.brainfuck.logic;

import org.junit.Assert;
import org.junit.Test;

public class CombinerTest {
    @Test
    public void getResultTest(){
        Combiner combiner = Combiner.getInstance();
        combiner.addSymbol('h');
        combiner.addSymbol('e');
        combiner.addSymbol('l');
        combiner.addSymbol('l');
        combiner.addSymbol('o');
        String resultCombinationOfSymbols = combiner.getResult();
        Assert.assertEquals("hello",resultCombinationOfSymbols);
    }
}

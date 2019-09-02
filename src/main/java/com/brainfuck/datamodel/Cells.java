package com.brainfuck.datamodel;

import com.brainfuck.logic.Combiner;

public class Cells {
    private static final int INITIALSIZE =100;
    private  byte[] operatedSymbols;
    private int pointer;
    private int currentSize;

    private static Cells cells = new Cells();

    private Cells(){
        this.operatedSymbols = new byte[INITIALSIZE];
       this.currentSize = 0;
        this.pointer=0;
    }
    public static Cells getInstance(){
        return cells;
    }

    public int getPointer() {
        return pointer;
    }


    public void increment(){
        operatedSymbols[pointer]++;
    }
    public void decrement(){
    operatedSymbols[pointer]--;
    }
    public void moveforward(){
        if(currentSize==pointer+1)
            increaseSizeOfArray();
        ++pointer;
    }
    public void movebackward(){
        --pointer;
    }
    public void print(){
        byte b = operatedSymbols[pointer];
       Combiner.getInstance().addSymbol((char) b);
    }
    public byte getCurrentElement(){
        return operatedSymbols[pointer];
    }
    private void increaseSizeOfArray(){
        calculateNewSize();
        byte temporaryCells[] = new byte[currentSize];
        for(int i = 0; i< operatedSymbols.length; i++){
            temporaryCells[i] = operatedSymbols[i];
        }
        operatedSymbols = temporaryCells;
    }
    private void calculateNewSize(){
       currentSize += currentSize/2;
    }

}


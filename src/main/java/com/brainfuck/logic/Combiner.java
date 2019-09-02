package com.brainfuck.logic;

import java.util.LinkedList;
import java.util.List;

public class Combiner {
    private static Combiner combiner = new Combiner();
    private  static List<Character> resultListOfSymbols = new LinkedList<>();
    private Combiner() {
    }

    public static Combiner getInstance() {
        return combiner;
    }

    public  void addSymbol(char symbol){
        resultListOfSymbols.add(symbol);
    }
    public  String getResult(){
        StringBuilder result = new StringBuilder();
        for(Character symbol : resultListOfSymbols){
            result.append(symbol);
        }
        return result.toString();

    }

}

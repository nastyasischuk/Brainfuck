package com.brainfuck.exceptions;

public class UnsupportedCommand extends RuntimeException {
    public UnsupportedCommand(char wrongCommand){
        super("Command "+wrongCommand + " cannot be executed");
    }

}

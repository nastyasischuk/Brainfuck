package com.brainfuck.command;

import com.brainfuck.exceptions.UnsupportedCommand;


public class CommandFactory {
    public static Command createCommand(char operationInSymbol) throws UnsupportedCommand {

        switch (operationInSymbol) {
            case '+':
                return new Increment();

            case '-':
                return new Decrement();

            case '>':
                return new MoveForward();

            case '<':
                return new MoveBackward();

            case '.':
                return new Print();

        }
        throw new UnsupportedCommand(operationInSymbol);
    }
}

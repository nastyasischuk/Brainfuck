package com.brainfuck.logic;

import com.brainfuck.command.Command;
import com.brainfuck.command.CommandFactory;
import com.brainfuck.command.implementation.LoopHandler;

public class Interpreter {
    private char[] commandInArray;
    private int pointerToCurrentCommand =0;
    public Interpreter(String initialCommand) {
        commandInArray = initialCommand.toCharArray();
    }
    public void run() {
        char symbol;
        for (pointerToCurrentCommand = 0; pointerToCurrentCommand < commandInArray.length; pointerToCurrentCommand++) {
            symbol = commandInArray[pointerToCurrentCommand];
            if (symbol == '[') {
               handleLoop2().execute();
            }
            else {
                    CommandFactory.createCommand(symbol).execute();
                }
            }
        }

    public LoopHandler handleLoop2(){
        LoopHandler loopHandler = new LoopHandler();
        pointerToCurrentCommand++;
        do{
            if(commandInArray[pointerToCurrentCommand]=='[') {
               loopHandler.addToExecuteList(handleLoop2());
                continue;
            }

            Command command = CommandFactory.createCommand(commandInArray[pointerToCurrentCommand]);
           loopHandler.addToExecuteList(command);
        }
        while (commandInArray[++pointerToCurrentCommand]!=']');
        return loopHandler;
    }

}

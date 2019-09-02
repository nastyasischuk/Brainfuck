package com.brainfuck.logic;

import com.brainfuck.command.Command;
import com.brainfuck.command.CommandFactory;
import com.brainfuck.command.LoopHandler;

public class Interpreter {
    private char[] commandInArray;
    private int pointerToCurrentCommand;
    public Interpreter(String initialCommand) {
        commandInArray = initialCommand.toCharArray();
       this.pointerToCurrentCommand = 0;
    }
    public void run() {
        char symbol;
        for (pointerToCurrentCommand = 0; pointerToCurrentCommand < commandInArray.length; pointerToCurrentCommand++) {
            symbol = commandInArray[pointerToCurrentCommand];
            if (symbol == '[') {
               handleLoop().execute();
            }
            else {
                    CommandFactory.createCommand(symbol).execute();
                }
            }
        }

    private LoopHandler handleLoop(){
        LoopHandler loopHandler = new LoopHandler();
        pointerToCurrentCommand++;
        do{
            if(commandInArray[pointerToCurrentCommand]=='[') {
               loopHandler.addToExecuteList(handleLoop());
                continue;
            }

            Command command = CommandFactory.createCommand(commandInArray[pointerToCurrentCommand]);
           loopHandler.addToExecuteList(command);
        }
        while (commandInArray[++pointerToCurrentCommand]!=']');
        return loopHandler;
    }

}

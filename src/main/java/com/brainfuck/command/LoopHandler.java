package com.brainfuck.command;

import com.brainfuck.command.Command;

import java.util.ArrayList;
import java.util.List;

public class LoopHandler implements Command {
    List<Command> commands= new ArrayList<>();
    @Override
    public void execute() {
    while(cells.getCurrentElement()!=0){
        for(Command command : commands){
            command.execute();
        }
    }
    }
    public void addToExecuteList(Command command){
    commands.add(command);
    }

}

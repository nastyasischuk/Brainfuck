package com.brainfuck.command;

import com.brainfuck.command.Command;

public class MoveForward implements Command {
    @Override
    public void execute() {
    cells.moveforward();
    }


}

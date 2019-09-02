package com.brainfuck.command;

import com.brainfuck.command.Command;

public class MoveBackward implements Command {
    @Override
    public void execute() {
        cells.movebackward();
    }

}

package com.brainfuck.command.implementation;

import com.brainfuck.command.Command;

public class MoveForward implements Command {
    @Override
    public void execute() {
    cells.moveforward();
    }


}

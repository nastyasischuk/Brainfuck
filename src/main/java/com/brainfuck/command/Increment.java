package com.brainfuck.command;

import com.brainfuck.command.Command;

public class Increment implements Command {
    @Override
    public void execute() {
    cells.increment();
    }

}

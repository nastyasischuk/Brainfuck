package com.brainfuck.command.implementation;

import com.brainfuck.command.Command;

public class Increment implements Command {
    @Override
    public void execute() {
    cells.increment();
    }

}

package com.brainfuck.command.implementation;

import com.brainfuck.command.Command;

public class Decrement implements Command {
    @Override
    public void execute() {
    cells.decrement();
    }

}

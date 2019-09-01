package com.brainfuck.command.implementation;

import com.brainfuck.command.Command;

public class Print implements Command {
    @Override
    public void execute() {
        cells.print();
    }

}

package com.brainfuck.command;


public class Print implements Command {
    @Override
    public void execute() {
        cells.print();
    }

}

package com.brainfuck.command;

import com.brainfuck.datamodel.Cells;

public interface Command {
    Cells cells = Cells.getInstance();
  void execute();
}

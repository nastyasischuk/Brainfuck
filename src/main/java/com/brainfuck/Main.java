package com.brainfuck;

import com.brainfuck.datamodel.Cells;
import com.brainfuck.logic.Combiner;
import com.brainfuck.logic.Interpreter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//String command="++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.>.";

        Interpreter interpreter = new Interpreter(inputCommand());
        interpreter.run();
        System.out.println(Cells.getInstance().getCurrentElement());
        System.out.println("Result :" + Combiner.getInstance().getResult());

    }
    public static String inputCommand(){
        System.out.println("Input command in com.brainfuck ");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        scanner.close();
        return command;
    }
}

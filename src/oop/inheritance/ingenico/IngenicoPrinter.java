package oop.inheritance.ingenico;

import oop.inheritance.TPV.Printer;

public class IngenicoPrinter implements Printer {

    private static IngenicoPrinter ingenicoPrinter = null;

    private IngenicoPrinter(){

    }

    public static IngenicoPrinter getInstance(){
        if(ingenicoPrinter == null){
            ingenicoPrinter = new IngenicoPrinter();
        }

        return ingenicoPrinter;
    }

    /**
     * Prints a message on the current line at the specified horizontal position
     *
     * @param x       horizontal offset
     * @param message Message to be printed
     */
    public void print(int x, String message) {

    }

    /**
     * Add a line break to the paper
     */
    public void lineFeed() {
    }

}

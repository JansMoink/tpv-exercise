package oop.inheritance.verifone.vx520;

import oop.inheritance.TPV.Printer;

public class VerifoneVx520Printer implements Printer {

    private static VerifoneVx520Printer verifoneVx520Printer = null;

    private VerifoneVx520Printer(){

    }

    public static VerifoneVx520Printer getInstance(){
        if(verifoneVx520Printer == null){
            verifoneVx520Printer = new VerifoneVx520Printer();
        }

        return verifoneVx520Printer;
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

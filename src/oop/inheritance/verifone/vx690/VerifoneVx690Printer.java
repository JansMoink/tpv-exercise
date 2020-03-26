package oop.inheritance.verifone.vx690.;

public class VerifoneVx690Printer {

    private static VerifoneVx690Printer verifoneVx690Printer = null;

    private VerifoneVx690Printer(){

    }

    public static VerifoneVx690Printer getInstance(){
        if(verifoneVx690Printer == null){
            verifoneVx690Printer = new VerifoneVx690Printer();
        }

        return verifoneVx690Printer;
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

package oop.inheritance.verifone.v240m;

public class VerifoneV240mPrinter {

    private static VerifoneV240mPrinter verifoneV240mPrinter = null;

    private VerifoneV240mPrinter(){

    }

    public static VerifoneV240mPrinter getInstance(){
        if(verifoneV240mPrinter == null){
            verifoneV240mPrinter = new VerifoneV240mPrinter();
        }

        return verifoneV240mPrinter;
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

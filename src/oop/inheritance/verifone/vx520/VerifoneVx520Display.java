package oop.inheritance.verifone.vx520.;

public class VerifoneVx520Display {

    private static VerifoneVx520Display verifoneVx520Display = null;

    private VerifoneVx520Display(){

    }

    public static VerifoneVx520Display getInstance(){
        if(verifoneVx520Display == null){
            verifoneVx520Display = new VerifoneVx520Display();
        }
        
        return verifoneVx520Display;
    }

    /**
     * Prints a message to specied position
     *
     * @param x       horizontal position
     * @param y       vertical position
     * @param message message to be printed
     */
    public void showMessage(int x, int y, String message) {
    }

    /**
     * Clears the screen
     */
    public void clear() {

    }
}

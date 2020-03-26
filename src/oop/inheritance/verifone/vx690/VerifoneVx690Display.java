package oop.inheritance.verifone.vx690;

public class VerifoneVx690Display {

    private static VerifoneVx690Display verifoneVx690Display = null;

    private VerifoneVx690Display(){

    }

    public static VerifoneVx690Display getInstance(){
        if(verifoneVx690Display == null){
            verifoneVx690Display = new VerifoneVx690Display();
        }
        
        return verifoneVx690Display;
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

package oop.inheritance.verifone.v240m;

public class VerifoneV240mDisplay {

    private static VerifoneV240mDisplay verifoneV240mDisplay = null;

    private VerifoneV240mDisplay(){

    }

    public static VerifoneV240mDisplay getInstance(){
        if(verifoneV240mDisplay == null){
            verifoneV240mDisplay = new VerifoneV240mDisplay();
        }
        
        return verifoneV240mDisplay;
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

package oop.inheritance.ingenico;

import oop.inheritance.TPV.Display;

public class IngenicoDisplay implements Display {

    private static IngenicoDisplay ingenicoDisplay = null;

    private IngenicoDisplay(){

    }

    public static IngenicoDisplay getInstance(){
        if(ingenicoDisplay == null){
            ingenicoDisplay = new IngenicoDisplay();
        }
        
        return ingenicoDisplay;
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

package oop.inheritance.ingenico;

import oop.inheritance.TPV.Keyboard;

public class IngenicoKeyboard implements Keyboard {

    private static IngenicoKeyboard ingenicoKeyboard = null;

    private IngenicoKeyboard(){

    }

    public static IngenicoKeyboard getInstance(){
        if(ingenicoKeyboard == null){
            ingenicoKeyboard = new IngenicoKeyboard();
        }

        return ingenicoKeyboard;
    }

    /**
     * @return key pressed
     */
    public String get() {
        return "Key pressed";
    }
}

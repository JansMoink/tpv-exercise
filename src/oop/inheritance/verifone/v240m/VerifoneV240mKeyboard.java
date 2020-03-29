package oop.inheritance.verifone.v240m;

import oop.inheritance.TPV.Keyboard;

public class VerifoneV240mKeyboard implements Keyboard {

    private static VerifoneV240mKeyboard verifoneV240mKeyboard = null;

    private VerifoneV240mKeyboard(){

    }

    public static VerifoneV240mKeyboard getInstance(){
        if(verifoneV240mKeyboard == null){
            verifoneV240mKeyboard = new VerifoneV240mKeyboard();
        }

        return verifoneV240mKeyboard;
    }

    /**
     * @return key pressed
     */
    public String get() {
        return "Key pressed";
    }
}

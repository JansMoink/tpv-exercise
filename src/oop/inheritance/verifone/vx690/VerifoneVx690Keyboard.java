package oop.inheritance.verifone.vx690;

import oop.inheritance.TPV.Keyboard;

public class VerifoneVx690Keyboard implements Keyboard {

    private static VerifoneVx690Keyboard verifoneVx690Keyboard = null;

    private VerifoneVx690Keyboard(){

    }

    public static VerifoneVx690Keyboard getInstance(){
        if(verifoneVx690Keyboard == null){
            verifoneVx690Keyboard = new VerifoneVx690Keyboard();
        }

        return verifoneVx690Keyboard;
    }

    /**
     * @return key pressed
     */
    public String get() {
        return "Key pressed";
    }
}

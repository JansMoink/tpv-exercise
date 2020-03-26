package oop.inheritance.verifone.vx520.

public class VerifoneVx520Keyboard {

    private static VerifoneVx520Keyboard verifoneVx520Keyboard = null;

    private VerifoneVx520Keyboard(){

    }

    public static VerifoneVx520Keyboard getInstance(){
        if(verifoneVx520Keyboard == null){
            verifoneVx520Keyboard = new VerifoneVx520Keyboard();
        }

        return verifoneVx520Keyboard;
    }

    /**
     * @return key pressed
     */
    public String get() {
        return "Key pressed";
    }
}

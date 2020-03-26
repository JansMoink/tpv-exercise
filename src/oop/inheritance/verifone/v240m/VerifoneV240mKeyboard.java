package oop.inheritance.verifone.v240m.;

public class VerifoneV240mKeyboard {

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

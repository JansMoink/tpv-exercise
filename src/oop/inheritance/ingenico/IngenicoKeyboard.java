package oop.inheritance.ingenico;

public class IngenicoKeyboard {

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

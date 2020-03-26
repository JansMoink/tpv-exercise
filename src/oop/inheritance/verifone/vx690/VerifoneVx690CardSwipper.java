package oop.inheritance.verifone.vx690;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;

public class VerifoneVx690CardSwipper {

    private static VerifoneVx690CardSwipper verifoneVx690CardSwipper = null;

    private VerifoneVx690CardSwipper(){

    }

    public static VerifoneVx690CardSwipper getInstance(){
        if(verifoneVx690CardSwipper == null){
            verifoneVx690CardSwipper = new VerifoneVx690CardSwipper();
        }

        return verifoneVx690CardSwipper;
    }

    public Card readCard(){
        return new Card("1246578514563698", new ExpirationDate(23,10), EntryMode.SWIPED);
    }
}

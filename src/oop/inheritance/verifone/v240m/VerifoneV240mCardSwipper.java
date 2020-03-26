package oop.inheritance.verifone.v240m;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;

public class VerifoneV240mCardSwipper {

    private static VerifoneV240mCardSwipper verifoneV240mCardSwipper = null;

    private VerifoneV240mCardSwipper(){

    }

    public static VerifoneV240mCardSwipper getInstance(){
        if(verifoneV240mCardSwipper == null){
            verifoneV240mCardSwipper = new VerifoneV240mCardSwipper();
        }

        return verifoneV240mCardSwipper;
    }

    public Card readCard(){
        return new Card("1246578514563698", new ExpirationDate(23,10), EntryMode.SWIPED);
    }
}

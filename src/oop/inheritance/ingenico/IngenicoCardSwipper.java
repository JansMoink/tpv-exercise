package oop.inheritance.ingenico;

import oop.inheritance.TPV.CardSwipper;
import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;

public class IngenicoCardSwipper implements CardSwipper {

    private static IngenicoCardSwipper ingenicoCardSwipper = null;

    private IngenicoCardSwipper(){

    }

    public static IngenicoCardSwipper getInstance(){
        if(ingenicoCardSwipper == null){
            ingenicoCardSwipper = new IngenicoCardSwipper();
        }

        return ingenicoCardSwipper;
    }

    public Card readCard(){
        return new Card("1246578514563698", new ExpirationDate(23,10), EntryMode.SWIPED);
    }
}

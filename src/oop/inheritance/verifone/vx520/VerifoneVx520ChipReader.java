package oop.inheritance.verifone.vx520;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;

public class VerifoneVx520ChipReader {

    private static VerifoneVx520ChipReader verifoneVx520ChipReader = null;

    private VerifoneVx520ChipReader(){

    }

    public static VerifoneVx520ChipReader getInstance(){
        if(verifoneVx520ChipReader == null){
            verifoneVx520ChipReader = new VerifoneVx520ChipReader();
        }

        return verifoneVx520ChipReader;
    }

    public Card readCard() {
        return Card.builder()
                .account("4558211532252558")
                .entryMode(EntryMode.INSERTED)
                .expirationDate(ExpirationDate.builder()
                        .year(20)
                        .month(8)
                        .build())
                .build();
    }

}

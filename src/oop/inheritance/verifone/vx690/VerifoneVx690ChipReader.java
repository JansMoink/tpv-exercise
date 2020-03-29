package oop.inheritance.verifone.vx690;

import oop.inheritance.TPV.ChipReader;
import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;

public class VerifoneVx690ChipReader implements ChipReader {

    private static VerifoneVx690ChipReader verifoneVx690ChipReader = null;

    private VerifoneVx690ChipReader(){

    }

    public static VerifoneVx690ChipReader getInstance(){
        if(verifoneVx690ChipReader == null){
            verifoneVx690ChipReader = new VerifoneVx690ChipReader();
        }

        return verifoneVx690ChipReader;
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

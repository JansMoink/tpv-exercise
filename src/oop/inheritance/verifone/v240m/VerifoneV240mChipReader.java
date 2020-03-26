package oop.inheritance.verifone.v240m;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;

public class VerifoneV240mChipReader {

    private static VerifoneV240mChipReader verifoneV240mChipReader = null;

    private VerifoneV240mChipReader(){

    }

    public static VerifoneV240mChipReader getInstance(){
        if(verifoneV240mChipReader == null){
            verifoneV240mChipReader = new VerifoneV240mChipReader();
        }

        return verifoneV240mChipReader;
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

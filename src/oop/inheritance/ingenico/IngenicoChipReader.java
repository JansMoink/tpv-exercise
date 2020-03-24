package oop.inheritance.ingenico;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;

public class IngenicoChipReader {

    private static IngenicoChipReader ingenicoChipReader = null;

    private IngenicoChipReader(){

    }

    public static IngenicoChipReader getInstance(){
        if(ingenicoChipReader == null){
            ingenicoChipReader = new IngenicoChipReader();
        }

        return ingenicoChipReader;
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

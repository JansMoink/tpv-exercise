package oop.inheritance.TPV;

import oop.inheritance.ingenico.*;

public class IngenicoTPVFactory extends AbstractTPVFactory{

    @Override
    public CardSwipper getCardSwipper() {
        return IngenicoCardSwipper.getInstance();
    }

    @Override
    public ChipReader getChipReader() {
        return IngenicoChipReader.getInstance();
    }

    @Override
    public Display getDisplay() {
        return IngenicoDisplay.getInstance();
    }

    @Override
    public Keyboard getKeyboard() {
        return IngenicoKeyboard.getInstance();
    }

    @Override
    public Ethernet getEthernet() {
        return IngenicoEthernet.getInstance();
    }

    @Override
    public GPS getGPS() {
        return IngenicoGPS.getInstance();
    }

    @Override
    public Modem getModem() {
        return IngenicoModem.getInstance();
    }

    @Override
    public Printer getPrinter() {
        return IngenicoPrinter.getInstance();
    }

    @Override
    public StorageSystem getStorageSystem() {
        return IngenicoStorageSystem.getInstance();
    }
}

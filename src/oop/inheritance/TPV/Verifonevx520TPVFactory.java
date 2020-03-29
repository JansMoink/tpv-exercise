package oop.inheritance.TPV;

import oop.inheritance.verifone.vx520.*;

public class Verifonevx520TPVFactory extends AbstractTPVFactory {
    @Override
    public CardSwipper getCardSwipper() {
        return VerifoneVx520CardSwipper.getInstance();
    }

    @Override
    public ChipReader getChipReader() {
        return VerifoneVx520ChipReader.getInstance();
    }

    @Override
    public Display getDisplay() {
        return VerifoneVx520Display.getInstance();
    }

    @Override
    public Keyboard getKeyboard() {
        return VerifoneVx520Keyboard.getInstance();
    }

    @Override
    public Ethernet getEthernet() {
        return VerifoneVx520Ethernet.getInstance();
    }

    @Override
    public GPS getGPS() {
        return VerifoneVx520GPS.getInstance();
    }

    @Override
    public Modem getModem() {
        return VerifoneVx520Modem.getInstance();
    }

    @Override
    public Printer getPrinter() {
        return VerifoneVx520Printer.getInstance();
    }

    @Override
    public StorageSystem getStorageSystem() {
        return VerifoneVx520StorageSystem.getInstance();
    }
}

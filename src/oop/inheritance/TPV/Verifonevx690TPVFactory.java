package oop.inheritance.TPV;

import oop.inheritance.verifone.vx690.*;

public class Verifonevx690TPVFactory extends AbstractTPVFactory {
    @Override
    public CardSwipper getCardSwipper() {
        return VerifoneVx690CardSwipper.getInstance();
    }

    @Override
    public ChipReader getChipReader() {
        return VerifoneVx690ChipReader.getInstance();
    }

    @Override
    public Display getDisplay() {
        return VerifoneVx690Display.getInstance();
    }

    @Override
    public Keyboard getKeyboard() {
        return VerifoneVx690Keyboard.getInstance();
    }

    @Override
    public Ethernet getEthernet() {
        return VerifoneVx690Ethernet.getInstance();
    }

    @Override
    public GPS getGPS() {
        return VerifoneVx690GPS.getInstance();
    }

    @Override
    public Modem getModem() {
        return VerifoneVx690Modem.getInstance();
    }

    @Override
    public Printer getPrinter() {
        return VerifoneVx690Printer.getInstance();
    }

    @Override
    public StorageSystem getStorageSystem() {
        return VerifoneVx690StorageSystem.getInstance();
    }
}

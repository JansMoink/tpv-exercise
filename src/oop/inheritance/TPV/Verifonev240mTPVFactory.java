package oop.inheritance.TPV;

import oop.inheritance.verifone.v240m.*;

public class Verifonev240mTPVFactory extends AbstractTPVFactory {
    @Override
    public CardSwipper getCardSwipper() {
        return VerifoneV240mCardSwipper.getInstance();
    }

    @Override
    public ChipReader getChipReader() {
        return VerifoneV240mChipReader.getInstance();
    }

    @Override
    public Display getDisplay() {
        return VerifoneV240mDisplay.getInstance();
    }

    @Override
    public Keyboard getKeyboard() {
        return VerifoneV240mKeyboard.getInstance();
    }

    @Override
    public Ethernet getEthernet() {
        return VerifoneV240mEthernet.getInstance();
    }

    @Override
    public GPS getGPS() {
        return VerifoneV240mGPS.getInstance();
    }

    @Override
    public Modem getModem() {
        return VerifoneV240mModem.getInstance();
    }

    @Override
    public Printer getPrinter() {
        return VerifoneV240mPrinter.getInstance();
    }

    @Override
    public StorageSystem getStorageSystem() {
        return VerifoneV240mStorageSystem.getInstance();
    }
}

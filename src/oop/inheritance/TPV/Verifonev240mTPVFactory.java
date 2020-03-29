package oop.inheritance.TPV;

import java.util.Map;
import java.util.HashMap;

import oop.inheritance.data.CommunicationType;
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
    public Map<CommunicationType, CommunicationDevice> getCommunicationDeviceMap() {
        Map<CommunicationType, CommunicationDevice> communicationDeviceEnumMap = new HashMap<>();

        communicationDeviceEnumMap.put(CommunicationType.ETHERNET, VerifoneV240mEthernet.getInstance());
        communicationDeviceEnumMap.put(CommunicationType.GPS, VerifoneV240mGPS.getInstance());
        communicationDeviceEnumMap.put(CommunicationType.MODEM, VerifoneV240mModem.getInstance());

        return communicationDeviceEnumMap;
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

package oop.inheritance.TPV;

import java.util.Map;
import java.util.HashMap;

import oop.inheritance.data.CommunicationType;
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
    public Map<CommunicationType, CommunicationDevice> getCommunicationDeviceMap() {
        Map<CommunicationType, CommunicationDevice> communicationDeviceEnumMap = new HashMap<>();

        communicationDeviceEnumMap.put(CommunicationType.ETHERNET, VerifoneVx520Ethernet.getInstance());
        communicationDeviceEnumMap.put(CommunicationType.GPS, VerifoneVx520GPS.getInstance());
        communicationDeviceEnumMap.put(CommunicationType.MODEM, VerifoneVx520Modem.getInstance());

        return communicationDeviceEnumMap;
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

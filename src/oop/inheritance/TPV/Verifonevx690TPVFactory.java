package oop.inheritance.TPV;

import java.util.HashMap;
import java.util.Map;

import oop.inheritance.data.CommunicationType;
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
    public Map<CommunicationType, CommunicationDevice> getCommunicationDeviceMap() {
        Map<CommunicationType, CommunicationDevice> communicationDeviceEnumMap = new HashMap<>();

        communicationDeviceEnumMap.put(CommunicationType.ETHERNET, VerifoneVx690Ethernet.getInstance());
        communicationDeviceEnumMap.put(CommunicationType.GPS, VerifoneVx690GPS.getInstance());
        communicationDeviceEnumMap.put(CommunicationType.MODEM, VerifoneVx690Modem.getInstance());

        return communicationDeviceEnumMap;
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

package oop.inheritance.TPV;

import java.util.Map;
import java.util.HashMap;

import oop.inheritance.data.CommunicationType;
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
    public Map<CommunicationType, CommunicationDevice> getCommunicationDeviceMap() {
        Map<CommunicationType, CommunicationDevice> communicationDeviceEnumMap = new HashMap<>();

        communicationDeviceEnumMap.put(CommunicationType.ETHERNET, IngenicoEthernet.getInstance());
        communicationDeviceEnumMap.put(CommunicationType.GPS, IngenicoGPS.getInstance());
        communicationDeviceEnumMap.put(CommunicationType.MODEM, IngenicoGPS.getInstance());

        return communicationDeviceEnumMap;
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

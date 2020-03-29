package oop.inheritance.TPV;

import java.util.Map;

import oop.inheritance.data.CommunicationType;
import oop.inheritance.data.SupportedTerminal;

public abstract class AbstractTPVFactory {

    public static AbstractTPVFactory getFactory(SupportedTerminal supportedTerminal){
        switch(supportedTerminal){
            case INGENICO:
                return new IngenicoTPVFactory();
            case VERIFONEV240M:
                return new Verifonev240mTPVFactory();
            case VERIFONEVX520:
                return new Verifonevx520TPVFactory();
            case VERIFONEVX690:
                return new Verifonevx690TPVFactory();
        }

        throw new UnsupportedOperationException("Terminal not supported");
    }

    public abstract CardSwipper getCardSwipper();

    public abstract ChipReader getChipReader();

    public abstract Display getDisplay();

    public abstract Keyboard getKeyboard();

    public abstract Map<CommunicationType, CommunicationDevice> getCommunicationDeviceMap();

    public abstract Printer getPrinter();

    public abstract StorageSystem getStorageSystem();
}

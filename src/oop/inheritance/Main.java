package oop.inheritance;

import oop.inheritance.data.SupportedTerminal;
import oop.inheritance.TPV.AbstractTPVFactory;

public class Main {

    public static void main(String[] args) {
        boolean running = true;
        AbstractTPVFactory factory = AbstractTPVFactory.getFactory(SupportedTerminal.INGENICO);
        Application application= new Application(factory);

        while (running) {
            application.clearScreen();
            application.showMenu();

            String key = application.readKey();

            switch (key) {
                case "1":
                    application.doSale();
                    break;
                case "2":
                    application.doRefund();
                    break;
                case "3":
                    application.printReport();
                    break;
                case "4":
                    application.showConfiguration();
                    break;
                case "5":
                    running = false;
                    break;
            }
        }
    }

}

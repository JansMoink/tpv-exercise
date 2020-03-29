package oop.inheritance;

import java.time.LocalDateTime;

import oop.inheritance.data.Card;
import oop.inheritance.data.CommunicationType;
import oop.inheritance.data.Transaction;
import oop.inheritance.data.TransactionResponse;

import oop.inheritance.TPV.*;

public class Application {

    private CommunicationType communicationType = CommunicationType.ETHERNET;
    private AbstractTPVFactory abstractTPVFactory;

    public Application(AbstractTPVFactory abstractTPVFactory) {
        this.abstractTPVFactory = abstractTPVFactory;
    }

    public void showMenu() {
            Display display = abstractTPVFactory.getDisplay();

            display.showMessage(5, 5, "MENU");
            display.showMessage(5, 20, "1. VENTA");
            display.showMessage(5, 23, "2. DEVOLUCION");
            display.showMessage(5, 26, "3. REPORTE");
            display.showMessage(5, 29, "4. CONFIGURACION");
            display.showMessage(5, 32, "5. APAGAR");
    }

    public String readKey() {
        Keyboard keyboard = abstractTPVFactory.getKeyboard();

        return keyboard.get();
    }

    public void doSale() {
        CardSwipper cardSwipper = abstractTPVFactory.getCardSwipper();
        ChipReader chipReader = abstractTPVFactory.getChipReader();
        Display display = abstractTPVFactory.getDisplay();
        Keyboard keyboard = abstractTPVFactory.getKeyboard();
        Card card;

        do {
            card = cardSwipper.readCard();
            if (card == null) {
                card = chipReader.readCard();
            }
        } while (card == null);

        display.clear();
        display.showMessage(5, 20, "Capture monto:");

        String amount = keyboard.get(); //Amount with decimal point as string

        Transaction transaction = Transaction.builder()
                .localDateTime(LocalDateTime.now())
                .card(card)
                .amountInCents(Integer.parseInt(amount.replace(".", "")))
                .build();

        TransactionResponse response = sendSale(transaction);

        if (response.isApproved()) {
            display.showMessage(5, 25, "APROBADA");
            printReceipt(transaction, response.getHostReference());
        } else {
            display.showMessage(5, 25, "DENEGADA");
        }
    }

    private void printReceipt(Transaction transaction, String hostReference) {
        Printer printer = abstractTPVFactory.getPrinter();
        Card card = transaction.getCard();

        printer.print(5, "APROBADA");
        printer.lineFeed();
        printer.print(5, card.getAccount());
        printer.lineFeed();
        printer.print(5, "" + transaction.getAmountInCents());
        printer.lineFeed();
        printer.print(5, "________________");
    }

    private TransactionResponse sendSale(Transaction transaction) {
        Ethernet ethernet = abstractTPVFactory.getEthernet();
        Modem modem = abstractTPVFactory.getModem();
        GPS gps = abstractTPVFactory.getGPS();
        TransactionResponse transactionResponse = null;

        switch (communicationType) {
            case ETHERNET:
                ethernet.open();
                ethernet.send(transaction);
                transactionResponse = ethernet.receive();
                ethernet.close();
                break;
            case GPS:
                gps.open();
                gps.send(transaction);
                transactionResponse = gps.receive();
                gps.close();
                break;
            case MODEM:
                modem.open();
                modem.send(transaction);
                transactionResponse = modem.receive();
                modem.close();
                break;
        }

        return transactionResponse;
    }

    public void doRefund() {
    }

    public void printReport() {
    }

    public void showConfiguration() {
    }

    public void clearScreen() {
        Display display = abstractTPVFactory.getDisplay();

        display.clear();
    }
}

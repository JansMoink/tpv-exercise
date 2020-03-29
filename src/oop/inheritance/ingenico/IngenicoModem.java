package oop.inheritance.ingenico;

import oop.inheritance.TPV.CommunicationDevice;
import oop.inheritance.data.Transaction;
import oop.inheritance.data.TransactionResponse;

public class IngenicoModem implements CommunicationDevice {

    private static IngenicoModem ingenicoModem = null;

    private IngenicoModem(){

    }

    public static IngenicoModem getInstance(){
        if(ingenicoModem == null){
            ingenicoModem = new IngenicoModem();
        }
        return ingenicoModem;
    }
    /**
     * Opens a connection using the modem device
     *
     * @return true if the connection was successfully opened
     */
    public boolean open() {

        return true;
    }

    /**
     * Sends a message to the server
     *
     * @param message message to be sent to the server
     * @return true if the message was sent successfully, false otherwise
     */
    public boolean send(Transaction message) {
        return true;
    }

    /**
     * Method blocks until host send a response or until a timeout is reached.
     *
     * @return Message received from the host. In case of timeout it returns null
     */
    public TransactionResponse receive() {
        return new TransactionResponse(true, "132123");
    }

    /**
     * Closes the channel releasing every used resources
     */
    public void close() {

    }
}

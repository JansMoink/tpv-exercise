package oop.inheritance.verifone.vx690;

import oop.inheritance.TPV.CommunicationDevice;
import oop.inheritance.data.Transaction;
import oop.inheritance.data.TransactionResponse;

public class VerifoneVx690Ethernet implements CommunicationDevice {

    private static VerifoneVx690Ethernet verifoneVx690Ethernet = null;

    private VerifoneVx690Ethernet(){

    }

    public static VerifoneVx690Ethernet getInstance(){
        if(verifoneVx690Ethernet == null){
            verifoneVx690Ethernet = new VerifoneVx690Ethernet();
        }
        return verifoneVx690Ethernet;
    }

    /**
     * Opens a connection using the ethernet device
     *
     * @return true if the connection was successfully opened
     */
    public boolean open() {

        return true;
    }

    /**
     * Sends a message to the server
     *
     * @param transaction message to be sent to the server
     * @return true if the message was sent successfully, false otherwise
     */
    public boolean send(Transaction transaction) {
        return true;
    }

    /**
     * Method blocks until host send a response or until a timeout is reached.
     *
     * @return Message received from the host. In case of timeout it returns null
     */
    public TransactionResponse receive() {
        return new TransactionResponse(true, "12314");
    }

    /**
     * Closes the channel releasing every used resources
     */
    public void close() {

    }

}

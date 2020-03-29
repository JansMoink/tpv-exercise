package oop.inheritance.verifone.v240m;

import oop.inheritance.TPV.CommunicationDevice;
import oop.inheritance.data.Transaction;
import oop.inheritance.data.TransactionResponse;

public class VerifoneV240mGPS implements CommunicationDevice {
    private static VerifoneV240mGPS verifoneV240mGPS = null;

    private VerifoneV240mGPS(){

    }

    public static VerifoneV240mGPS getInstance(){
        if(verifoneV240mGPS == null){
            verifoneV240mGPS = new VerifoneV240mGPS();
        }
        return verifoneV240mGPS;
    }
    /**
     * Opens a connection using the GPS device
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
        return new TransactionResponse(true, "782132");
    }

    /**
     * Closes the channel releasing every used resources
     */
    public void close() {

    }
}

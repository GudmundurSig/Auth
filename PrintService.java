package com.DTU;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PrintService extends UnicastRemoteObject implements Printerface {


    public PrintService() throws RemoteException {
        super();
    }

    @Override
    public String Echo(String input) throws RemoteException {
        return "from server " + input;
    }
}

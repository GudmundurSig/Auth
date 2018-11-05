package com.DTU;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Printerface extends Remote {
    public String Echo(String input) throws RemoteException;
}

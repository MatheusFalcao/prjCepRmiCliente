package control;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICep extends Remote{
	
	public String[] consulta(String cep) throws RemoteException;

}

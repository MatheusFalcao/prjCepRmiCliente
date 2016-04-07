package control;

import java.rmi.RemoteException;

public interface ICep{
	
	public Object consulta(String cep) throws RemoteException;

}

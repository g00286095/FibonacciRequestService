package ie.gmit;
import java.rmi.RemoteException;
import java.rmi.Remote;


public interface RemoteFibonacci extends Remote{
	public String getFibonacciSequence(int max) throws RemoteException;
	
}

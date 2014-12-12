package ie.gmit;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;

public class Fibonacci extends UnicastRemoteObject implements RemoteFibonacci{
		
	protected Fibonacci() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@Override
		public String getFibonacciSequence(int max) throws RemoteException {
			  int length = max;
			  long[] series = new long[length];{
				series[0] = 0;
				series[1] = 1;
				for (int i = 2; i < length; i++) {
			    series[i] = series[i - 1] + series[i - 2];
				}
				 System.out.print(Arrays.toString(series));
			return null;
		}
	}
}

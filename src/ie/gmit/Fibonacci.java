package ie.gmit;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class Fibonacci /*extends UnicastRemoteObject */implements RemoteFibonacci{
		
	public String max;
	protected Fibonacci() /*throws RemoteException*/ {
		super();
		// TODO Auto-generated constructor stub
	}
	private LinkedList<FibRequest> inqueue = new LinkedList<FibRequest>();
	
	
	private Map<Integer, String> outqueue = new HashMap<Integer, String>();
	


	public Object getUniqueId(String jobId2) {
		int jobId = (int) (Math.random()*1000000000*(Math.random()));

	
	inqueue.add(new FibRequest(jobId, max));
	return jobId;
	}

	

		public String getFibonacciSequence(int max) /*throws RemoteException*/ {
		  
			  ArrayList<Integer> series = new ArrayList<Integer>();{
				series.add(0);
				series.add(1);
				for (int i = 2; i < max; i++) {
			    series.add(series.get(i-1) + series.get(i-2));
				}
				 //System.out.print(Arrays.toString(series));
			return series.toString();}
		}
			  public String getResult(int jobId, int max){
					
					if(outqueue.containsKey(jobId)){
						String result = outqueue.get(jobId);
						outqueue.remove(jobId);
						return result;
					}else{
							return null;
					}

			  

	}

}
package ie.gmit;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class FibService {
	private LinkedList<FibRequest> inqueue = new LinkedList<FibRequest>();
	
	private Map<Integer, String> outqueue = new HashMap<Integer, String>();
	
	public int add(int max){
		int jobNumber = (int) Math.random();
	
	inqueue.addLast(new FibRequest(jobNumber, max));
	return jobNumber;
}
public String getResult(int jobNumber){
	if(outqueue.containsKey(jobNumber)){
		String result = outqueue.get(jobNumber);
		outqueue.remove(jobNumber);
		return result;
	}else{
			return null;
		}
	}
}
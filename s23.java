package pattern;

import java.util.HashMap;
import java.util.Map;

public class s23 
{
	public static void main(String[] args)
	{
		Map<String,Integer> h=new HashMap<String,Integer>();
		h.put("end", 2);
		h.put("done", 6);
		h.put("start", 9);
		h.put("before", 8);
		System.out.println(h);
		
		for(Map.Entry<String, Integer> o1:h.entrySet())
		{
			System.out.println(o1.getKey()+" "+o1.getValue());
		}
	}

}

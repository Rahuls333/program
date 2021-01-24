package pattern;

import java.util.HashMap;
import java.util.Map;

public class s24 
{
	public static void main(String[] args)
	{
		Map<String,Integer> h=new HashMap<String,Integer>();
		h.put("end", 2);
		h.put("done", 6);
		h.put("start", 9);
		h.put("before", 8);
		System.out.println(h);
		
	System.out.println(h.get("end"));
	System.out.println(h.containsKey("start"));
	System.out.println(h.containsValue(8));
	}

}

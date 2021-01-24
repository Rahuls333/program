package pattern;

import java.util.HashMap;
import java.util.Map;

public class s25 
{
	public static void main(String[] args)
	{
		Map<String,Integer> map=new HashMap<String,Integer>();
		String []arr={"hi","ho","hi","ko","hi"};
		
		for(String s:arr)
		{
			if(!map.containsKey(s))
			{
				map.put(s, 1);
			}
			else
			{
				int count=map.get(s);
				map.put(s, count+1);
			}
		}
		
		for(Map.Entry<String, Integer> o1:map.entrySet())
		{
			System.out.println(o1.getKey()+" "+o1.getValue());
		}
	}

}

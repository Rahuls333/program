package pattern;

import java.util.HashMap;
import java.util.Map;

public class s26 
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
		int longest=0;
		String s1="";
		for(Map.Entry<String, Integer> o1:map.entrySet())
		{
			if(o1.getValue()>longest)
			{
				longest=o1.getValue();
				s1=o1.getKey();
				
			}
			System.out.println(s1+" "+longest);
			break;
		}
	}

}

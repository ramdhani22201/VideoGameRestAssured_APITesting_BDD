package restAssuredTest;

import java.util.HashMap;
import java.util.Map;

public class DuplicateStringInHashMap {

	public static void main(String[] args) {
		String str = "Ram and ap Ram";
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		String [] strArr = str.split(" ");
		
		for(String s : strArr)
		{
			
			if(hmap.containsKey(s))
			{
				hmap.put(s, hmap.get(s)+1);
			}
			else
			{
				hmap.put(s, 1);
			}			
		}
		System.out.println(hmap);
		for(Map.Entry<String, Integer> e : hmap.entrySet())
		{
			if(e.getValue() >1)
			{
				System.out.println(e.getKey() +"  "+ e.getValue());
			}
		}
	}

}

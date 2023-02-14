/*
 * HashMap
-create
-add
-iterate
-remove & test
-update 1 record & test
-fetching only keys
-fetching only values
-compute
 */

package java_collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("IT", 12);
		map.put("CSE",5);
		map.put("CSM", 14);
		System.out.println(map);
		for(Map.Entry<String, Integer> m:map.entrySet())
			System.out.println(m.getKey()+"->"+m.getValue());
		map.remove("CSE");
		System.out.println(map);
		
		map.replace("CSM", 11);
		System.out.println(map);
		
		for(String k:map.keySet())
			System.out.println(k);
		
		for(Integer i:map.values())
			System.out.println(i);
		
		

	}

}

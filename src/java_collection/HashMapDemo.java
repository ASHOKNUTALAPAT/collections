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

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("IT", 12);
		map.put("CSE", 5);
		map.put("CSM", 10);
		
		System.out.println(map);

		for(Map.Entry m:map.entrySet())
			System.out.println(m.getKey()+"->"+m.getValue());
		
		map.put("CSM", 14);
		System.out.println(map);
		
		map.remove("CSE");
		System.out.println(map);
		
		Integer v=map.get("CSM");
		map.put("CSM", v*v);
		System.out.println(map);
		
		System.out.println();
		for(String k:map.keySet())
			System.out.print(k+" ");
		
		System.out.println();
		for(Integer e:map.values())
			System.out.println(e+" ");
	
		map.compute("IT",(key,value)->value==null?1:value+1);
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

/*
 * How to create HashSet object in Java
How to store Object into HashSet
Iterating through HashSet
How to check HashSet is empty
How to remove objects from HashSet in Java
How to clear HashSet in Java
How to find size of HashSet in java
How to check if HashSet contains an object
How to convert HashSet into an array in Java
 */

package java_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(111);
		set.add(112);
		set.add(113);
		Iterator<Integer> it=set.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
		System.out.println();
		System.out.println("Is Set Empty?:"+set.isEmpty());
		set.remove(112);	
		System.out.println("Set size is:"+set.size());
		System.out.println("Searching set for 111:"+set.contains(111));
		System.out.println("Searching set for 112:"+set.contains(112));
		Object a[]=set.toArray();
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		set.clear();
		System.out.println(set);	
	}

}

package java_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList<Integer>();
		
		list1.add(11);
		list1.add(22);
		list1.add(33);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(111);
		list2.add(222);
		list2.addAll(list1);
		
		System.out.println(list2);
		
		list2.removeAll(list1);
		System.out.println(list2);
		
	}

}

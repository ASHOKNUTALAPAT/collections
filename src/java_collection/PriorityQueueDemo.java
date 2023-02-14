package java_collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Queue<Integer> q=new PriorityQueue<Integer>();
		q.add(67);
		q.add(15);
		q.add(17);
		System.out.println(q);
		
		System.out.println("Element removed:"+q.remove());
		
		System.out.println(q);*/
		
		Queue<Integer> q=new PriorityQueue<Integer>();
		q.offer(67);
		q.offer(15);
		q.offer(17);
		System.out.println(q);
		
		System.out.println("Element removed:"+q.poll());
		
		System.out.println(q);


	}

}

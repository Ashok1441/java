package collection;

import java.util.PriorityQueue;

public class DemoPriorityQueue {
	public static void main(String[] args) {
		
		PriorityQueue q1 = new PriorityQueue<>();
		q1.add("A"); 
		q1.add("B"); 
		q1.add("a"); 
		q1.add("b");
		q1.offer("C"); 
		q1.add("D"); 
		 
		System.out.println(q1); 
//		System.out.println(q1.peek());
//		System.out.println(q1.poll());
//		System.out.println(q1);
//		System.out.println(q1.contains("AWS"));
		

	}

}

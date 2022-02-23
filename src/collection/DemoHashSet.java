package collection;

import java.util.HashSet;
import java.util.Iterator;

public class DemoHashSet {
	public static void main(String[] args) {
		HashSet s1 = new HashSet<>(); 
		 s1.add(1223); 
		 
		 s1.add(88.9f); 
		 s1.add("ashok");
		 s1.add("selenium");
		 System.out.println(s1);
		 s1.add("Java");
		 System.out.println(s1);
		 s1.add(null);
		 s1.add(null);
		 s1.add(null);
		 s1.add(null);
		 System.out.println(s1);
		 
		Iterator i1 = s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
			
		}
	}

}

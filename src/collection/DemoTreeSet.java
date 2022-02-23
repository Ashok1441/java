package collection;

import java.util.TreeSet;

public class DemoTreeSet {
	public static void main(String[] args) {
		TreeSet s1 = new TreeSet<>();
		s1.add("Rohan"); 
		 s1.add("Riya"); 
		 s1.add("Pooja"); 
	 s1.add("ashok"); 
//		 s1.add('A'); 
		 System.out.println("Hash set objectss are: "+s1);
		 System.out.println(s1.first());
		 System.out.println(s1.last());
		 System.out.println(s1.pollFirst());
		 System.out.println(s1.pollLast());
		 System.out.println(s1);
		 
	}

}

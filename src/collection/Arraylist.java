package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Arraylist {

	public static void main(String[] args) {
		
		
		ArrayList a1= new ArrayList();
		a1.add("Ashok");
		a1.add("Kumar");
		a1.add(123456);
		a1.add(7799359065l);
		a1.add(66.1f);
		System.out.println("collection objects are :"+a1);
		
		a1.add("Ashok");
		System.out.println("It allows duplicate data in arraylist objects :"+a1);
		
		a1.add(null);
		System.out.println("It allows null data in arraylist objects :"+a1);
		
		a1.remove("Ashok");	
		//a1.remove(2);
		System.out.println("After removing the data in arraylist objects :"+a1);
		
		Integer i=100;
		a1.add(i);
		
		System.out.println(a1);
		
		System.out.println(a1.get(4));
		
		a1.set(2,"SQL"); 
		System.out.println("After setting object :"+a1);
		
		a1.add(1,"Full Stack JAVA"); 
		System.out.println("After adding at particular index :"+a1);
		
		System.out.println(a1.size());
		
		//addall
		ArrayList a2=new ArrayList(); 
		a2.addAll(a1); 
		a2.add("Ashok");
		System.out.println("After copying :"+a2);
		System.out.println(a2.contains("SQL")); 
		System.out.println(a1.isEmpty());
		
		for(int j=0;j<a2.size();j++) { 
			 System.out.println(a2.get(j)); 
			 }
		Collections.reverse(a2);
    	System.out.println(a2);
//		//Collections.shuffle(a2);
//		System.out.println(a2);
//
//		a2.removeAll(a2);
//		System.out.println(a2);
    	a2.retainAll(a2);
    	System.out.println(a2);
		
}

}

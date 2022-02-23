package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<>();
		a.add(123456);
		a.add(789456);
		//a.add("ashok");
		System.out.println(a);
		
		ArrayList<String> a1=new ArrayList<>();
		a1.add("ashok");
		a1.add("chinnu");
		System.out.println(a1);
		
		ArrayList<Object> a2=new ArrayList<>();
		a2.add("kumar");
		a2.add(7799359065l);
		a2.add(a1);
		a2.add(a);
		System.out.println(a2);
//		for(Object data:a2) 
//		{ 
//		System.out.println(data); 
//		}
		//ListIterator<Object> i1 = a2.listIterator();
		
		Iterator<Object> i1 = a2.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
//		while(i1.hasPrevious()) {
//			System.out.println(i1.previous());
//		}
		
		
		

	}

}

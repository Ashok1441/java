package collection;

import java.util.LinkedList;

public class LinkedLsit {
	public static void main(String[] args) {
		
		LinkedList a1=new LinkedList<>();
		a1.add("Ashok");
		a1.add("Kumar");
		a1.add(123456);
		a1.add(7799359065l);
		a1.add(66.1f);
		System.out.println("collection objects are :"+a1);
		System.out.println("--------------------------------------------------------------------------------------------");
		
		a1.add("Ashok");
		System.out.println("It allows duplicate data in arraylist objects :"+a1);
		System.out.println("--------------------------------------------------------------------------------------------");
		
		a1.add(null);
		a1.add(null);
		System.out.println("It allows null data in arraylist objects :"+a1);
		System.out.println("--------------------------------------------------------------------------------------------");
		
		a1.remove("Ashok");	
		//a1.remove(2);
		System.out.println("After removing the data in arraylist objects :"+a1);
		System.out.println("--------------------------------------------------------------------------------------------");
		
		a1.addFirst("Pasula");
		System.out.println(a1);
		System.out.println("--------------------------------------------------------------------------------------------");
		
		a1.addLast("Chinnu");
		System.out.println(a1);
		System.out.println("--------------------------------------------------------------------------------------------");
		
		
		System.out.println(a1.getFirst());
		System.out.println(a1.getLast());
		System.out.println("--------------------------------------------------------------------------------------------");
		
		a1.removeFirst();
		System.out.println(a1);
		a1.removeLast();
		System.out.println(a1);
		
	}

}

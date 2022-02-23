package collection;

import java.util.HashMap;

public class DemoHashMap {

	public static void main(String[] args) {
		 
		HashMap m1 = new HashMap<>();
		 m1.put(101,"Samsung"); 
		 m1.put(102,"Realme"); 
		 m1.put(103,"Oppo"); 
		 m1.put(104,"Vivo"); 
		 System.out.println("Map Objects are : "+m1);
		 
		 m1.put(103, "oppo");
		 System.out.println(m1.entrySet());
		 System.out.println("Duplicate key : "+m1);
		 m1.put(105, "iphone");
		 System.out.println("Duplicate value : "+m1);
		 System.out.println("All keys : "+m1.keySet()); 
		 System.out.println("All keys : "+m1.values()); 
		 System.out.println("Check key : "+m1.containsKey(1001)); 
		 System.out.println("Check Value : "+m1.containsValue("iphone"));
		 System.out.println(m1.get(102));
		 
//		 for(Object data:m1.keySet()) 
//				{ 
//				System.out.println(data+"    "+m1.get(data)); 
//				}
		 for(Object data:m1.values()) 
			{ 
			System.out.println(data); 
			}
		 
		
		 

	}

}

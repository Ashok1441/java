package practie;

//Overridden with inheritances

class Parents //Ex-1
 { 
	public void car()//Overridden method 
		{ 
			System.out.println("Blue color"); 
		} 
	public void carname() 
		{ 
			System.out.println("Audi"); 
		} 
 } 

class Son extends Parents 
 { 
	public void car()//Overriding method 
		{ 
			System.out.println("Black color"); 
		} 
 } 

class Daughter extends Parents 
 { 
	public void car() 
	{ 
		System.out.println("Pink color"); 
	} 
	public void carname() 
	{ 
		System.out.println("Nano"); 
	} 
}

public class MethodOveriding {
  
	public static void main(String[] args) {
		
		Parents par = new Parents();
		par.car();
		par.carname();
		
	    Son son = new Son();
	    son.car();
	    son.carname();
	    
	   Daughter dau = new Daughter();
	   dau.car();
	   dau.carname();
   }
}

















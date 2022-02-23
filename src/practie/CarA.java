package practie;

public class CarA {
	

	 static String brname="Audi";//static var
	 int capacity=4;//non static var
	 
	 //non static
   public void details()
	    {
		 String color="Black";//local var
		 long price=5500000l;//local var
		 System.out.println("Car name : "+brname);
		 System.out.println("Car capacity : "+capacity);
		 System.out.println("Color is : "+color);
		 System.out.println("Starting Price : "+price);
	   }
	//static method
   public static void features()
	   {
	      //classname referencevar=new classname();
		  CarA c1=new CarA();
		  c1.details();
		  System.out.println("Accessing the non variable in static method is "+c1.capacity);
	    }
   //main method
    public static void main(String args[])
	   {
	      features();
	   }

}

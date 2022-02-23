package practie;

//no parameter constructor
public class Car {

	//non static variable
	String carname;
	int price;
	String color;
	int capacity;
	public Car()
	 {
		carname="Hyundai i20";
		price=700000;
		color="Red";
		capacity=4;
	 }
   public static void main(String args[])
    {
	   Car c=new Car();
	   	System.out.println(c.carname);
	   	System.out.println(c.price);
	   	System.out.println(c.color);
	   	System.out.println(c.capacity);
  }

}

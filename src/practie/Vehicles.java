package practie;

abstract class Customers {
	
	abstract public void price();
	abstract public void models();

}
class RoyalEnfield extends Customers 
 { 
 	@Override 
  public void price() 
  { 
    System.out.println("2 Lakhs");
    System.out.println("2.5 Lakhs");
    System.out.println("2.2 Lakhs"); 
    System.out.println("---------------------------------------------------------------");
  } 
   @Override 
  public void models() 
   { 
    System.out.println("350 CC Classic"); 
    System.out.println("500 CC Classic");
    System.out.println("411 CC Himalaya");
   }
	
 } 

public class Vehicles{
	
	public static void main(String[] args) {
		RoyalEnfield re = new RoyalEnfield();
		re.price();
		re.models();
	}
	
}

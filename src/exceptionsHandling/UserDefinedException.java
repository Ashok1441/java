package exceptionsHandling;

class NotEligibleException extends RuntimeException //Ex-1 
	{ 
	  public NotEligibleException(String msg) 
		{ 
		  System.out.println(msg); 

		}		
	  }


public class UserDefinedException {
	
	public static void main(String[] args) {
	float percentage=59.5f ;
		
	 if(percentage<60) 
	 { 
	    throw new NotEligibleException("Not Eligible for drive"); 
	 } 
	 else 
	 { 
	 System.out.println("Register before end of the day"); 
	 } 
	}

}

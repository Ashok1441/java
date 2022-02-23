package exceptionsHandling;

public class Sample1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Throws Handling ");
		Thread.sleep(5000);
		System.out.println("Successesfully Handled Throws Exception ");
		 demo();		
	}
	
	public static void demo() {
		System.out.println("Program is Started ");
		System.out.println("Program is in Progress ");
		try {
			
			Thread.sleep(10000);
		}
		catch (InterruptedException e) {
			// System.out.println(" Exception Handled ");
		}
		
		System.out.println("Program is successfully Completed ");
		System.out.println("Program is Ended ");
		
	}

}

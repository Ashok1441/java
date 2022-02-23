package exceptionsHandling;

public class Sample {
	public static void main(String[] args) {
		int a=10,b=0,c;
		int[] no=new int[5];
		try {
			//this is not proper way to write exception for array and arithmatic
			no[10]=10;// executed
			c=a/b;//unexecuted
			
		}
		catch (ArithmeticException e) {
		System.out.println("Can't divided 'a' with 'b' because the 'b' value is 0");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array value is out of index");
	}
		// like this we write progam we gotexception
		
//		try {
//			
//			System.out.println(no[0]);
//			System.out.println(no[1]);
//			System.out.println(no.length);
//			no[10]=10;
//			System.out.println(no[10]);
//			
//		}
//		
//		catch (Exception e) {
//			System.out.println("multiple catch block used to under it will work not");
//		}
//		
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("The given array value is not there in Array Size");
//		}
		
		
		
	}

}

package exceptionsHandling;

public class ExampleForException {

	public static void main(String[] args) {
		
		

		
		
		//this is proper way to write exception
		try {
			String name=null;
		System.out.println(name.length());
		}
		catch (NullPointerException e) {
			System.out.println("String value is Null so we get NullPointerException");
		}
		
		
		try {
			int a=30, b=0;
			int c=a/b;
			System.out.println("Ans ="+c);
			
		}
		catch (ArithmeticException e) {
			System.out.println("Can't divided 'a' with 'b' because the 'b' value is 0");		
		}
		
		
//			int num=Integer.parseInt("Ashok"); instead of int value we use String value we get number format exception
//			System.out.println(num);
			
		try { 		
			int num1=Integer.parseInt("Ashok");
			System.out.println(num1);
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("instead of int value we use String value we get number format exception NumberFormatException");
		}
		
		//single try with mutliple catches
		try {
			int[] no=new int[10];
			no[0]=1;
			no[1]=2;
			System.out.println(no[0]);
			System.out.println(no[1]);
			System.out.println(no.length);
			no[10]=10;
			System.out.println(no[10]);
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The given array value is not there in Array Size");
		}
		catch (Exception e) {
			System.out.println("multiple catch block used to under it will work not");//it is not excuted because for this catch block we don't have a exception
		}
	}

}

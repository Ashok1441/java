package exceptionsHandling;

public class ExceptionDemo {
	public static void main(String[] args) {
		
		int a=10, b=0;
		try {
		System.out.println(a/b); //ArithmeticException
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} 
		String name=null;
//		System.out.println(name.length()); //NullPointerException
		
		String myName="ashok";
		//int i=Integer.parseInt(myName);
//		System.out.println(i);//NumberFormatException
		
//		int[] no=new int[10];
//		no[10]=10; //ArrayIndexOutOfBoundsException
	}

}

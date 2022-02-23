package exceptionsHandling;

public class FinallyExample {
	
	public static void main(String[] args) {
		try {
			int[] no=new int[10];
			String name="ashok";
			no[0]=1;
			no[1]=2;
			System.out.println(no[0]);
			System.out.println(no[1]);
			System.out.println(name.length());
			System.out.println(name);
			no[10]=10;
			System.out.println(name);
			
		}
		// if we dont use this we got exception
		//exception handling
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The given array value is not there in Array Size");
		}
		finally {
			System.out.println("finally block will be excecuted every time when exception is there or not in try block");
		}
	}

}

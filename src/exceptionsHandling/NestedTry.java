package exceptionsHandling;

public class NestedTry {
	
	public static void main(String[] args) {
		try {

			try {
			String name=null;
			System.out.println(name.length());
			}
			catch (Exception e) {
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
			System.out.println("other statements");
		}
		catch (Exception e) {
			
			System.out.println("Hanled are recoverd");
		}
	}

}

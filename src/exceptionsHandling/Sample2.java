package exceptionsHandling;

import java.io.IOException;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException, IOException, ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
		demo();
		
		//throw new  InterruptedException  (" hello  ");// we cant write two throw at a time " throws"
		//throw new ArrayIndexOutOfBoundsException("Hello1");
		throw new  ArithmeticException("Hello2");
//		throw new NumberFormatException("Hello3");
		//throw new RuntimeException("Hello4");
//		throw new IOException("Hello5");													  //" throws"
//		throw new ClassNotFoundException("Hello5");											 //" throws"
//		throw new NoSuchFieldException("Hello6");											//" throws"
//		throw new NoSuchMethodException("Hello7");                                         //" throws"
		
		
	}
	public static void demo() {
		try {
		throw new StringIndexOutOfBoundsException("Hello8");
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("exception Handled");
		}
	}
	

}

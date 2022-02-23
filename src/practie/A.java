package practie;

public class A {
	static int i=500;
	
	int a;
	int b;
	int c;
	
	public void operation() {
		System.out.println(a+b+c);
	}
	public static void main(String args [])
	{
	System.out.println(i);
	System.out.println(A.i);
	A a1=new A();
	System.out.println(a1.i);
	a1.a=100;
	a1.b=150;
	a1.c=200;
	a1.operation();

	}

}

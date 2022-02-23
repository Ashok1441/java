package practie;

public class Method {
	
	public static void main(String args[]) {
		
	System.out.println("ashok");
	
	Method m = new Method();
	ashok();// static method
	m.kumar();//no static method
	
	}
	public static void ashok() {
		System.out.println("kumar");
	}
	public void kumar() {
		System.out.println("pasula");
	}
}

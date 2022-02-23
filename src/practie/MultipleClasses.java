package practie;

public class MultipleClasses {

	public static void main(String[] args) {
		System.out.println("Main Class");
		
		Ashok as = new Ashok();
		as.ashok();
		
		kumar ku = new kumar();
		ku.main();
	}

}

class Ashok {
	
	public void ashok() {
		System.out.println("Ashok");
	}
}


class kumar{
	public static void main() {
		System.out.println("kumar");
	}
}

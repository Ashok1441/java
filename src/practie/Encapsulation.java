package practie;

class Login{
	private String usrName;
	private int pwd;

	public void setUsername(String usrName ) {
	this.usrName=usrName;
	 }
	public String getUsername() {
		return usrName;
	
	}
	public void setPwd(int pwd ) {
		this.pwd=pwd;
		 }
		public int getPwd() {
			return pwd;
			
		
		}
}
public class Encapsulation {
	public static void main(String[] args) {
		Login lg = new Login();
		lg.setUsername("Ashok kumar");
		lg.setPwd(123456);
		
		System.out.println(lg.getUsername());
		System.out.println(lg.getPwd());
	}
	
	

}

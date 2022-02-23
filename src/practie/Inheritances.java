package practie;

class Bank  //Ex‐1
   {
	String accname="John";
	int accno=245678;
	
	double avalbal=100;
	double amt=4550.5;
//	  public void details()
//	   {
//		System.out.println("Account Holder : "+accname+" accno:"+accno);
//		System.out.println("ashok");
//		System.out.println(avalbal);
//	   }
	}


class Deposit extends Bank
  {
	
	public void depositamt()
	  {
		avalbal=avalbal+amt;
		System.out.println("Account Holder : "+accname+" accno:"+accno);
		System.out.println("Total balance after depositing Amt :"+avalbal);
	 }
  }

public class Inheritances
{
	public static void main(String args[])
	{
		Deposit d1=new Deposit();
	//	d1.details();
		d1.depositamt();

	}
}

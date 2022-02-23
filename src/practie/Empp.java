package practie;

public class Empp 
	{
	  String name,desg;
	  int id,sal;
  public Empp(String name,String desg,int id,int sal)
	   {    //intialise
	        this.name=name;
	        this.desg=desg;
	        this.id=id;
	        this.sal=sal;
	    }
	    //defining display()
  public void display()
	    {
	    	System.out.println("Name :"+name);
	    	System.out.println("Designation :"+desg);
	    	System.out.println("Their ID :"+id);
	    	System.out.println("Sal per month is :"+sal);
	    }
  public static void main(String args[])
	    {
	    	Empp e1=new Empp("John","QA",1234,25000);
	    	e1.display();
	    	Empp e2=new Empp("Rahul","QA",1235,27000);
	    	e2.display();
	    	Empp e3=new Empp("Ramesh","QA",1236,26000);
	    	e3.display();
	    	Empp e4=new Empp("Mahesh","QA",1237,24000);
	    	e4.display();
	    }


}

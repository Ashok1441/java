package practie;

public class  Student {
	String name;
	  int age;
	//parameterized constructor
	  public Student(String sname,int sage)
	  {
	    name=sname;
	    age=sage;
	  }
	  public static void main(String args[])
	   {
	Student s1=new Student("John",22);
	System.out.println(s1.name+" "+s1.age);
	Student s2=new Student("Rohan",24);
	System.out.println(s2.name+" "+s2.age);
	Student s3=new Student("Rahul",24);
	System.out.println(s3.name+" "+s3.age);
	  }

}

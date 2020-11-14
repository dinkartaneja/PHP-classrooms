package student_person_inheritence;

public class Person {
	private String fname;
	private String lname;
	private int Age;
	private char sex;
	//dinkartaneja 1911380
	public Person(String fname,String lname,char sex,int Age)
	{
		this.Age = Age;
		this.fname = fname;
		this.lname = lname;
		this.sex = sex;
	}
	
	public Person()
	{
		
	}
	public Person(int age,char sex)
	{
		this.sex = sex;
		this.Age = age;
	}
	public void setfirstName(String name)
	{
		this.fname = name;
	}
	public void setage(int age)
	{
		this.Age = age;
	}
	//dinkartaneja 1911380
	public int getage() {
		return this.Age;
	}
	public void setsex(char sex)
	{
		this.sex = sex;
	}
	public char getsex() {
		return this.sex;
	}
	
	public void setlastName(String name)
	{
		this.lname = name;
	}
	public String getfirstname() {
		return this.fname;
	}
	public String getlastname()
	{
		return this.lname;
	}
	//dinkartaneja 1911380
	public void displayinfo()
	{
		System.out.println("Name: "+this.fname +" "+this.lname);
		System.out.println("Age "+this.Age );
		System.out.println("Sex "+this.sex);
		
	}

}

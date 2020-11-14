package student_person_inheritence;

public class Student extends Person {
	private String Username;
	private int StudentID;
	private String College;
	private String Email;
	private String Password;

	public Student()
	{
		
	}
	public void student(String Username,int StudentID, String College,String Email,String Password)
	{
		//dinkartaneja 1911380
		this.Username = Username;
		this.StudentID = StudentID;
		this.College = College;
		this.Email = Email;
		this.Password = Password;
		
	}

	public void setUsername(String name)
	{
		this.Username = name;
	}
	public void setStudentID(int id)
	//dinkartaneja 1911380
	{
		this.StudentID = id;
	}
	public void setCollege(String clg)
	{
		this.College = clg;
	}
	public void setEmail(String email)
	{
		this.Email = email;
	}
	public void setpassword(String pass)
	{
		this.Password = pass;
	}
	public String getUsername() {
		return this.Username;
	}
	public int getStudentID() {
		return this.StudentID;
	}
	public String getCollege() {
		return this.College;
	}
	public String getEmail() {
		return this.Email;
	}
	public String getpassword() {
		return this.Password;
	}
	//dinkartaneja 1911380
	public void displayinfo()
	{
		System.out.println("UserName: "+this.Username);
		System.out.println("Student ID: "+this.StudentID);
		System.out.println("Password: "+this.Password);
		System.out.println("Email: "+this.Email);
		System.out.println("College Name: "+this.College);
		
	}
	public void displayall()
	{
		System.out.println("First Name: "+getfirstname());
		System.out.println("Last Name: "+getlastname());
		System.out.println("Age: "+getage());
		System.out.println("Sex: "+getsex());
		//dinkartaneja 1911380
		System.out.println("UserName: "+this.Username);
		System.out.println("Student Id: "+this.StudentID );
		System.out.println("Password: "+this.Password);
		System.out.println("Email: "+this.Email );
		System.out.println("College Name: "+this.College);
		
	}
	
	
	
}
 
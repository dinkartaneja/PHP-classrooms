package Employee_application;
import java.util.Scanner;


public class Employee extends Person {
	//dinkartaneja 1911380 1 november
	Scanner input = new Scanner(System.in);
	private String username;
	private String employee_id;
	private String position;
	private String company_name;
	private String salary;
	private String email;
	private String password;
	boolean trial = false;
	//dinkartaneja 1911380 1 november
	public Employee() {
		username = "dinkar";
		employee_id = "1234";
		position = "manager";
		this.setFirstname("firstname");
		this.setLastname("lastname");
		company_name = "Luminac tech";
		this.setAge("23");
		this.setGender("M");
		salary = "89990";
		email = "dinkar@yahoo.com";
		password = "abc123";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public String getPosition() {
		return position;
	}
	//dinkartaneja 1911380 1 november
	public void setPosition(String position) {
		this.position = position;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}
	//dinkartaneja 1911380 1 november
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void EnterEmployee(Employee A) {
		input.useDelimiter("\n");
		System.out.print("Enter the EmployeeID (4 digits): ");
		A.setEmployee_id(input.next());
		System.out.print("Enter the username: ");
		A.setUsername(input.next());
		System.out.print("Enter the password: ");
		A.setPassword(input.next());
		System.out.print("Enter the First Name: ");
		A.setFirstname(input.next());
		System.out.print("Enter the Last Name: ");
		A.setLastname(input.next());
		System.out.print("Enter the Age (2 digit number): ");
		A.setAge(input.next());
		System.out.print("Enter the Gender (M/F): ");
		A.setGender(input.next());
		System.out.print("Enter the Company Name: ");
		A.setCompany_name(input.next());
		System.out.print("Enter the Position: ");
		A.setPosition(input.next());
		System.out.print("Enter the Salary: ");
		A.setSalary(input.next());
	}

	public void DisplayEmployee(Employee A) {
		System.out.print("Employee ID: " + A.getEmployee_id());
		System.out.print("Username: " + A.getUsername());
		System.out.print("Password: " + A.getPassword());
		System.out.print("First Name: " + A.getFirstname());
		System.out.print("Last Name: " + A.getLastname());
		System.out.print("Age: " + A.getAge());
		System.out.print("Gender: " + A.getGender());
		System.out.print("Company: " + A.getCompany_name());
		System.out.print("Position: " + A.getPosition());
		System.out.print("Salary: " + A.getSalary());
		System.out.println("\n");
	}
}

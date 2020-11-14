package student_person_inheritence;
import java.util.Scanner;
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dinkartaneja 1911380
int choice;
		
		Scanner sobj = new Scanner(System.in);	
		Person p=new Person();
		
		Student s = new Student();
		
		
		do {
			System.out.println("\n Please choose 1 as per your Choice....");
			System.out.println("Press 1 to Enter the values for Student");
			System.out.println("Press 2 to display info of Student" );
			System.out.println("Press 0 to Exit  ...");
				
			choice=sobj.nextInt();
			//dinkartaneja 1911380
			switch(choice)
			{
				case 1:
				{
					System.out.println("Enter the FirstName: ");
					p.setfirstName(sobj.next());
					System.out.println("Enter the Last Name: ");
					p.setlastName(sobj.next());
					System.out.println("Enter the Age: ");
					p.setage(sobj.nextInt());
					System.out.println("Enter the User Name: ");
					s.setUsername(sobj.next());
					System.out.println("Enter the Email: ");
					s.setEmail(sobj.next());
					System.out.println("Enter the Student Id : ");
					s.setStudentID(sobj.nextInt());
					System.out.println("Enter the Password: ");
					s.setpassword(sobj.next());
					System.out.println("Enter the College Name: ");
					s.setCollege(sobj.next());
					System.out.println("All The Values are entered... ");
					break;
					//dinkartaneja 1911380
				}
				case 2:
				{
					p.displayinfo();
					s.displayinfo();
					break;
				}
				//dinkartaneja 1911380
				case 0:
				{
					System.out.println("You choosed to Exit the Application ");
					break;
				}
			
			}
						
		}while(!(choice==0));

	}

}

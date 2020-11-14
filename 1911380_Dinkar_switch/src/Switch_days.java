import java.util.Scanner;
public class Switch_days {
		public static void main(String[] args) {
			int days;
			Scanner sc = new Scanner(System.in);
			//Made by dinkar taneja 1911380 on 3 september
			System.out.println("Enter a number between 1 to 7 ");
			        days = sc.nextInt();
			        
			        switch (days) {
			        case 1:
			          System.out.println("Monday");
			          break;
			        case 2:
			          System.out.println("Tuesday");
			          break;
			        case 3:
			          System.out.println("Wednesday");
			          break;
			        case 4:
			          System.out.println("Thursday");
			          break;
			        case 5:
			          System.out.println("Friday");
			          break;
			        case 6:
			          System.out.println("Saturday");
			          break;
			        case 7:
			          System.out.println("Sunday");
			          break;
			        default:
			            System.out.println("Wrong value. Enter a number between 1 to 7");
			      }
			}

}

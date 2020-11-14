/**
 * @author Mihai
 * 2019-09-13
 * working with if else, switch, for and do while
 */
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// variables declaration
		float entered = 0;
		float max = 0, min = 0, total = 0;
		float average = 0;
		int count = 0, option = 0;
		String name = "";
		Scanner scanObject = new Scanner(System.in);
		
    	System.out.println("Please enter your Name: ") ;
		name = scanObject.nextLine();
		
		// main menu declaration
		do {
			System.out.println("\n\nEnter 1 to calculate the MAX and Average of 6 numbers") ;
			System.out.println("Enter 2 to calculate the MIN, MAX and Average") ;
			System.out.println("Enter 3 to quit") ;
			System.out.print("Enter your option : ") ;
			option = scanObject.nextInt();
			
			switch(option) {
			case 1 :{
				for(int i=0; i<6; i++) {
					System.out.print("\n\n\n\n\nEnter your number "+(i+1)+" : ") ;
					entered = scanObject.nextFloat();
					if(i == 0) {max = entered;}
					else {if(max < entered) {max = entered;}}
					total += entered;
				}
				average = total/6;
				System.out.println("The maximum value you enter is : "+max) ;
				System.out.println("The average is : " + average + "\n\n\n\n\n") ;
			}break;
			case 2 :{
				int ans = 0;
				do {
					System.out.println("Enter value(s) to compute the MIN, MAX and Average or 0 to quit") ;
					ans = scanObject.nextInt();
					if(ans != 0) {
						count++;
						if(count == 1) {
							min = ans;
							max = ans;
							average = ans;
							total = ans;
						}else {
							if(min > ans) {min = ans;}
							if(max < ans) {max = ans;}
							total += ans;
							average = total/count;
						}
					}
					
				}while(ans != 0);
				System.out.println("The minimum value you enter is : "+min) ;
				System.out.println("The maximum value you enter is : "+max) ;
				System.out.println("The average is : " + average + "\n\n\n\n\n") ;				
			}break;
			case 3 :{System.out.println(name + ", you decide to quit.") ;}break;
			default: System.out.println(name + ", enter 1 for first test or 2 for 2nd test or 3 to quit.") ;
			}
		}while(option != 3);
	}
}

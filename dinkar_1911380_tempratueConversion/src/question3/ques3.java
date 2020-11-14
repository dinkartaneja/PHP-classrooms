package question3;
import java.util.Scanner;
public class ques3 {
public static void main(String[] args) {
	/**
	* Java program to convert Celsius to Fahrenheit to  (ºC to ºF ).
	*
	* @author dinkartaneja
	*/
		Temp.Increment=0;   
		 Scanner scan = new Scanner(System.in);

		 int option, EntryArray[],Entry;  
		 
		
		 
		 double conversionValue[];  
		 EntryArray = new int [1];
		 //initialing max value to be 10
		//dinkartaneja
		 conversionValue = new double[10]; 
		 Temp T1; 
		 
		 
		do {
			
			System.out.println("Press 1 to Choose C to F or F to C conversion");
			System.out.println("Press 2 to Enter the Number to be Converted");
			System.out.println("Press 3 to Modify the Option 1 Choosen");
			System.out.println("Press 4 to Caluclate the Entered Data and Display the Result");
		
			System.out.println("Press 0 to Quit the Application");
		 
			option = scan.nextInt(); 
		 
			switch (option) {
			
			
		case 0:
			System.out.println("You have Choosen to Quit the Application!!");
			
			break ;
			
			
		case 1:
			System.out.println("Enter 1 to Choose ºC to ºF conversion");
			
			System.out.println("Enter 2 to Choose ºF to ºC conversion");
			Entry = scan.nextInt();
			if(Entry==1) {
				EntryArray[0]=1;	
			}
			else if (Entry==2) {
				EntryArray[0]=2;
			}
			 break;
			              
			              
			              
			              
			              
		case 2:
			
			System.out.println("Enter the Value to be Converted");
			conversionValue[Temp.Increment]= scan.nextDouble();
			Temp.Increment++;
			break;
			
			
			
			
		case 3:
             System.out.println("Enter 1 to Modify C to F conversion");
			
			 System.out.println("Enter 2 to Modify F to C conversion");
			 Entry = scan.nextInt();
			 if(Entry==1) {
					EntryArray[0]=1;
					
				}
				else if (Entry==2) {
					EntryArray[0]=2;
				}
			     break;
			     
			     
			     

			                 
		case 4:
			T1 = new Temp(); 
			double Number = conversionValue[Temp.Increment-1];   
			
			if(EntryArray[0]==1) {
				T1.CtoF(Number);
				T1.DisplayData();
				
			}
			else if (EntryArray[0]==2) {
				T1.FtoC(Number);
				T1.DisplayData();
			}
			
			break;
			                 
		default:
			System.out.println("Please Enter a Valid Option");
		 }
		 
		 
		 
		 
		}while(option!=0);
                       
	}
}



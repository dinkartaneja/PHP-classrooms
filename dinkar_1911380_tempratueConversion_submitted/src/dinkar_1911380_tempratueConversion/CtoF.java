package dinkar_1911380_tempratueConversion;

import java.util.Scanner;

public class CtoF {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		/**
		* Java program to convert Celsius to Fahrenheit to  (ºC to ºF ).
		*
		* @author dinkartaneja
		*/
		String name;
		int l=0;
		float sum = 0, average = 0;
		Scanner input = new Scanner(System.in);
 
		float num=0;
		//initialing max value to be 10
		float far[] = new float[10];
		 
		do {
		System.out.println("Enter Your First Name: ");
		//dinkartaneja
      	 Scanner sc = new Scanner(System.in);
      	name = sc.nextLine();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter your "+(i+1)+" of temprature in °C: ");
		        num=input.nextFloat();
		        //dinkartaneja
		        sum += num;
		        far[i]=9*(num/ 5) + 32;
		}
		
		System.out.println("Your sum is"+sum);
		System.out.println("Hello "+name+ " your values in °F are below ");
		
		for (int i = 0; i < 10; i++) {
			System.out.print("your "+(i+1)+" temprature value in °F is "+far[i]+"\n");
		}
		average= sum/10;
		System.out.println("Your sum is "+sum);
       	System.out.println("Your Average is "+average);
       	
    	System.out.println("\n \n Do you want to continue ? \n Press 1 for yes \t Press 0 for no");
 		l = sc.nextInt();
 		}
 		while(l == 1);
}

}



/*
 * 
 * 
 * Enter Your First Name: 
dinkar
Enter your 1 of temprature in °C: 
100
Enter your 2 of temprature in °C: 
40
Enter your 3 of temprature in °C: 
30
Enter your 4 of temprature in °C: 
10
Enter your 5 of temprature in °C: 
0
Enter your 6 of temprature in °C: 
-10
Enter your 7 of temprature in °C: 
-20
Enter your 8 of temprature in °C: 
-30
Enter your 9 of temprature in °C: 
-40
Enter your 10 of temprature in °C: 
-100
Your sum is-20.0
Hello dinkar your values in °F are below 
your 1 temprature value in °F is 212.0
your 2 temprature value in °F is 104.0
your 3 temprature value in °F is 86.0
your 4 temprature value in °F is 50.0
your 5 temprature value in °F is 32.0
your 6 temprature value in °F is 14.0
your 7 temprature value in °F is -4.0
your 8 temprature value in °F is -22.0
your 9 temprature value in °F is -40.0
your 10 temprature value in °F is -148.0
Your sum is -20.0
Your Average is -2.0

 
 Do you want to continue ? 
 Press 1 for yes 	 Press 0 for no

 */

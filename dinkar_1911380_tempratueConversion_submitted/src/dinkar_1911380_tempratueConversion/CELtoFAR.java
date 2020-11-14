package dinkar_1911380_tempratueConversion;
import java.util.Scanner;
public class CELtoFAR {
	/**
	* Java program to convert Celsius to Fahrenheit to  (ºC to ºF ).
	*
	* @author dinkartaneja
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		int l=0;
		float cel = 0, sum = 0, average = 0, far=0;
		Scanner input = new Scanner(System.in);
		
		do {
       	 System.out.println("Enter Your First Name: ");
       	 Scanner sc = new Scanner(System.in);
       	 
       	 name = sc.nextLine(); 
       	System.out.println("Enter your values of temprature in °C");
       	
       	
       	
       	 for(int i=0; i<10; i++) {
       		System.out.println(name+ " enter Your "+(i+1)+" value in °C: ");
       		
       		cel = input.nextInt();
       		sum += cel;
       		far = 9 * (cel / 5) + 32;
       		
       		System.out.println(name+" your temprature value in °F is "+far);
       		
       	 }
       	 
       	 average=sum/10;
       	 
       	 
       	System.out.println("Your sum is"+sum);
       	System.out.println("Your Average is"+average);
       	 
       	       			
       	System.out.println("\n \n Do you want to continue ? \n Press 1 for yes \t Press 0 for no");
 		l = sc.nextInt();
 		}
 		while(l == 1);
	
	}

}

/*
 * 
 * Enter Your First Name: 
dinkar taneja
Enter your values of temprature in °C
dinkar taneja enter Your 1 value in °C: 
100
dinkar taneja your temprature value in °F is 212.0
dinkar taneja enter Your 2 value in °C: 
120
dinkar taneja your temprature value in °F is 248.0
dinkar taneja enter Your 3 value in °C: 
55
dinkar taneja your temprature value in °F is 131.0
dinkar taneja enter Your 4 value in °C: 
30
dinkar taneja your temprature value in °F is 86.0
dinkar taneja enter Your 5 value in °C: 
10
dinkar taneja your temprature value in °F is 50.0
dinkar taneja enter Your 6 value in °C: 
30
dinkar taneja your temprature value in °F is 86.0
dinkar taneja enter Your 7 value in °C: 
67
dinkar taneja your temprature value in °F is 152.6
dinkar taneja enter Your 8 value in °C: 
86
dinkar taneja your temprature value in °F is 186.8
dinkar taneja enter Your 9 value in °C: 
90
dinkar taneja your temprature value in °F is 194.0
dinkar taneja enter Your 10 value in °C: 
0
dinkar taneja your temprature value in °F is 32.0
Your sum is588.0
Your Average is58.8

 
 Do you want to continue ? 
 Press 1 for yes 	 Press 0 for no

 * */






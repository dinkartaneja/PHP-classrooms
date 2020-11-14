import java.util.Scanner;
public class min_max_average_noifelse {
	/* author dinkar taneja made on 13 september*/
	 public static void main(String[] args) {
	
		 int min, max;
		 
		 
		 
		 
		 
		 String fname;
		 Scanner s = new Scanner(System.in);
		 Scanner sc = new Scanner(System.in);
		 int val=0;
		 int count=0,l=0;
		 min = max = val;
		 float sum=0,avg=0;

		 
		 
		 do {
			 System.out.println("Enter Your First Name: ");
        	 fname = sc.next(); 
        	 
        	 
			 System.out.print("Enter a Value "+fname+" : ");
			 val = s.nextInt();
			 
			 
			 
		 
		 while (val != 0) {
		   System.out.print("Enter next Value "+fname+": ");
		   count++;
		   sum += val;
		   /* author dinkar taneja made on 13 september*/
		   val = s.nextInt();
		   if (val < min) {
		       min = val;
		   }
		   if (val > max) {
		      max = val;
		   }
		 };
		 avg=sum/count;
		 System.out.println("Avg: " + avg);
		 System.out.println("Min: " + min);
		 System.out.println("Max: " + max);
		 
    
		 
		 
		 
		 System.out.println(fname+" Do you want to continue ? \n Press 1 for yes \t Press 0 for no");
		 /* author dinkar taneja made on 13 september*/
	 		l = sc.nextInt();
		 }
		 while(l == 1);
	 
	 }
}

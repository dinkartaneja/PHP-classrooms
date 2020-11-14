package question3;

public class Temp {
	double f,c, Result;
	public static int  Increment; 
	
//Convert C to F
//dinkartaneja
	
	double CtoF(double c) {
		this.Result= (c*9/5)+32;
		return Result;
	}
	
// Convert F to C
//dinkartaneja
	double FtoC(double f) {
		this.Result= (f-32)*5/9;
		return Result;
		
	}
	
	
//Display the Data
//dinkartaneja
	void DisplayData() {
		System.out.println("The Result for the conversion is "+this.Result+"\n \n");
	}
	
	
}

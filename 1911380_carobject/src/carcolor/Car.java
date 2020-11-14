package carcolor;

public class Car {
	double startMiles; 
	double endMiles; 
	double gallons; 
	String model;
	String mark;
	String color;
	double weight;
	int doors;
	int seats;
	
	
	Car( double first, double last, double gals )
	{
	startMiles = first ;
	endMiles = last ;
	gallons = gals ;
	}
	Car(String model2,String mark2,String color2,double weight2,int doors2,int seats2)
	{
		model=model2;
		mark=mark2;
		color=color2;
		weight=weight2;
		doors=doors2;
		seats=seats2;
		
	}
	
	double calculateMPG()
	{
	return (endMiles - startMiles)/gallons ;
	}
	void printDetails()
	{
		System.out.println("Model of your car is:"+model);
		System.out.println("Mark of your car is:"+mark);
		//dinkartaneja 1911380
		System.out.println("Color of your car is:"+color);
		System.out.println("Weight of your car is:"+weight+" kg");
		System.out.println("Your car has "+doors+" doors");
		System.out.println("Your car has "+seats+" seats");
	}

}

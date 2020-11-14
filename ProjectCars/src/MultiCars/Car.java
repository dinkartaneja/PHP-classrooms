/**
 * 
 */
package MultiCars;

/
public class Car {
	// instance variables
	double startMiles; // Stating odometer reading
	double endMiles; // Ending odometer reading
	double gallons; //Gallons of gas used between the readings
	String model;
	String mark;
	String color;
	double weight;
	int nbrOfDoors;
	int nbrOfSeats;
	// constructors
	Car( double first, double last, double gals )
	{ startMiles = first ;
	endMiles = last ;
	gallons = gals ;
	}
	Car( String mod, String mar, String col, double wei, int nDoors, int nSeats ){
	model = mod;
	mark = mar;
	color = col;
	weight = wei;
	nbrOfDoors = nDoors;
	nbrOfSeats = nSeats;
	}
	// methods
	double calculateMPG()
	{ return (endMiles - startMiles)/gallons ; }
	void displayDetails() {
	System.out.println("Model: "+model+", Marc: "+mark+", Color:"
	+color+", Weight: "+weight+", Numbers of doors: "+nbrOfDoors+", Number of seats: "+nbrOfSeats);
	}

}

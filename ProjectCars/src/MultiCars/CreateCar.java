/**
 * 
 */
package MultiCars;


public class CreateCar {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create objects
		Car car1 = new Car( 32456, 32810, 10.6 );
		System.out.println( "Details of car 1 are :");
		car1.displayDetails() ;
		System.out.printf( "Miles per gallon of car 1 is %.2f \n",car1.calculateMPG()
		);
		String model;
		String mark;
		String color;
		double weight;
		int nbrOfDoors;
		int nbrOfSeats;
		Car car2 = new Car( "BMW", "M6", "Silver", 1750, 4, 5 );
		System.out.println( "Details of car 2 are :");
		car2.displayDetails() ;
		System.out.printf( "Miles per gallon of car 2 is %.2f \n",car2.calculateMPG()
		);
		}

	}

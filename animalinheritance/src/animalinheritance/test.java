package animalinheritance;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		animal a = new animal();
		Dog d = new Dog();
		
		a.eat();
		d.eat();
		
		System.out.println("result of add(x,y) from animal class =" +a.add(10,20));
		System.out.println("result of add(x,y) from animal class =" +a.add(10,20,30));
		
		System.out.println("result of add(x,y) from dog class =" +d.add(10,20));
		System.out.println("result of add(x,y) from dog class =" +d.add(10,20,30));
		
		
		
	}

}

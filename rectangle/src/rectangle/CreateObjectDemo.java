package rectangle;

public class CreateObjectDemo {
	public static void main(String[] args) {
		//Made by dinkar taneja 1911380 on 20 september
		Point originOne = new Point(40, 25);
		Rectangle rectOne = new Rectangle(originOne, 100, 200);
		Rectangle rectTwo = new Rectangle(50, 100);
		//Made by dinkar taneja 1911380 on 20 september
		System.out.println("Width of rectOne: " + rectOne.width);
		System.out.println("Height of rectOne: " + rectOne.height);
		System.out.println("Area of rectOne: " + rectOne.getArea());
		// set rectTwo's position
		rectTwo.origin = originOne;
		//Made by dinkar taneja 1911380 on 20 september
		System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
		System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
		// move rectTwo and display its new position
		rectTwo.move(100, 300);
		//Made by dinkar taneja 1911380 on 20 september
		System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
		System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
		}
}

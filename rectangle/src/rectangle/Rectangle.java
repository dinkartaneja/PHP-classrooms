package rectangle;

public class Rectangle {
	public int width = 0;
	public int height = 0;
	public Point origin;
	//Made by dinkar taneja 1911380 on 20 september
	public Rectangle() {
	origin = new Point(0, 0);
	}
	public Rectangle(Point p) {
	origin = p;
	}
	public Rectangle(int w, int h) {
	origin = new Point(0, 0);
	width = w;
	height = h;
	}
	public Rectangle(Point p, int w, int h) {
	origin = p;
	width = w;
	height = h;
	}
	//Made by dinkar taneja 1911380 on 20 september
	public void move(int x, int y) {
	origin.x = x;
	origin.y = y;
	}
	//Made by dinkar taneja 1911380 on 20 september
	public int getArea() {
	return width * height;
	}
}

package _DesignPatterns.ShapeOrnek;

public class Rectangle implements IShape{

	public Rectangle() {
		draw();
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Rectangle...");
	}

}

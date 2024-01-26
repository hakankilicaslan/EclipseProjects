package _DesignPatterns.ShapeOrnek;

public class Circle implements IShape{

	public Circle() {
		draw();
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Circle...");
	}

}

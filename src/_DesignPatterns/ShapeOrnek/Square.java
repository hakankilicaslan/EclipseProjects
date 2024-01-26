package _DesignPatterns.ShapeOrnek;

public class Square implements IShape{

	public Square() {
		draw();
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing Square...");
	}

}

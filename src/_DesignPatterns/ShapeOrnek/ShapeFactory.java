package _DesignPatterns.ShapeOrnek;

public class ShapeFactory {

	public static IShape builder(EShape tip) {
		
		switch (tip) {
		
		case CIRCLE: return new Circle();
		case SQUARE: return new Square();	
		case RECTANGLE: return new Rectangle();
		default: return new Circle();
		
		}
		
	}
	
}

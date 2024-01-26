package _DesignPatterns.ShapeOrnek;

public class FactoryPatternDemo {

	public static void main(String[] args) {

		ShapeFactory.builder(EShape.CIRCLE);
		
		ShapeFactory.builder(EShape.SQUARE);
		
		ShapeFactory.builder(EShape.RECTANGLE);
		
	}

}

package structural.design.patterns.bridge;

/**
 * 
 * Bridge is used where we need to decouple an abstraction from its
 * implementation so that the two can vary independently. This type of design
 * pattern comes under structural pattern as this pattern decouples
 * implementation class and abstract class by providing a bridge structure
 * between them. This pattern involves an interface which acts as a bridge which
 * makes the functionality of concrete classes independent from interface
 * implementer classes. Both types of classes can be altered structurally
 * without affecting each other.
 *
 */

public class App {
	public static void main(String[] args) {
		Shape redCircle = new Circle(150, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(125, 100, 10, new GreenCircle());
		redCircle.draw();
		greenCircle.draw();
	}

}

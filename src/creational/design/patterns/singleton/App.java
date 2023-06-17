package creational.design.patterns.singleton;

/**
 * 
 * Singleton pattern is one of the simplest design patterns in Java. This type
 * of design pattern comes under creational pattern as this pattern provides one
 * of the best way to create an object. This pattern involves a single class
 * which is responsible to creates own object while making sure that only single
 * object get created. This class provides a way to access its only object which
 * can be accessed directly without need to instantiate the object of the class.
 *
 */

public class App {

	public static void main(String[] args) {

		// Early obj1 = new Early();
		EarlySingleton.getInstance().someMethod();

		// Lazy obj2 = new Lazy();
		LazySingleton.getInstance().someMethod();

		// ThreadSafeSingleton obj3 = new ThreadSafeSingleton();
		ThreadSafeSingleton.getInstance().someMethod();
	}

}

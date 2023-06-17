package creational.design.patterns.singleton;

public class LazySingleton {

	private static LazySingleton obj;

	private LazySingleton() {
	}

	public static LazySingleton getInstance() {

		// Lazy singleton, instance will be created at request time
		if (obj == null) {
			obj = new LazySingleton();
		}
		return obj;
	}

	public void someMethod() {
		System.out.println("Method in LazySingleton class");

	}
}

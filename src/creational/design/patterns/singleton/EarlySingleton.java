package creational.design.patterns.singleton;

public class EarlySingleton {

	// Early loading, instance will be created at load time
	private static EarlySingleton obj = new EarlySingleton();

	private EarlySingleton() {
	}

	public static EarlySingleton getInstance() {
		return obj;
	}

	public void someMethod() {
		System.out.println("Method in EarlySingleton class");
	}
}

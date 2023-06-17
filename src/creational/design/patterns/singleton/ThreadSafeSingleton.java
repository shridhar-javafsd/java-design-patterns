package creational.design.patterns.singleton;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
	}

	// thread-safe singleton, method can be accessed only by one thread at a time
	
	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}

	public void someMethod() {
		System.out.println("Method in ThreadSafeSingleton class");

	}

}

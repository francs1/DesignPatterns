package Creational.Singleton;

public class LazySingleton {

	private static volatile LazySingleton lazySingleton = null;

	private LazySingleton() {

	}

	public static synchronized LazySingleton getInstance() {
		if (lazySingleton == null) {
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}
}

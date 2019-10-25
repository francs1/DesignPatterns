package Creational.Singleton;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LazySingleton l1 = LazySingleton.getInstance();
		LazySingleton l2 = LazySingleton.getInstance();
		System.out.println(l1 == l2);

		HungrySingleton h1 = HungrySingleton.getInstance();
		HungrySingleton h2 = HungrySingleton.getInstance();
		System.out.println(h1 == h2);
	}

}

package Creational.FactoryMethod;

public class Client {

	public static void main(String[] args) {
		//扩展点
		Factory factory;
		
		//扩展点
		factory = new FactoryA();
		//切换到B工厂
		//factory = new FactoryB();
		
		//创建模式，最终得到的对象
		Product product = factory.createProduct();
		product.generateProduct();

		
	}

}

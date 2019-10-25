package Creational.AbstractFactory;

public class ConcreteFactory2 implements AbstractFactory {

	@Override
	public Product1 newProduct1() {
		System.out.println("具体工厂 2 生成-->具体产品 12...");
		return new ConcreteProduct12();
	}

	@Override
	public Product2 newProduct2() {
		System.out.println("具体工厂 2 生成-->具体产品 22...");
		return new ConcreteProduct22();
	}

}

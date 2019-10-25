package Creational.FactoryMethod;

public class FactoryB implements Factory {

	@Override
	public Product createProduct() {
		// TODO Auto-generated method stub
		return new ProductB();
	}

}

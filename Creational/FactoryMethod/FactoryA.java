package Creational.FactoryMethod;

public class FactoryA implements Factory {

	@Override
	public Product createProduct() {
		// TODO Auto-generated method stub
		return new ProductA();
	}
	

}

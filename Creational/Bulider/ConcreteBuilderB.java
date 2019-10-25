package Creational.Bulider;

public class ConcreteBuilderB extends Builder {

	public ConcreteBuilderB() {
		if (product == null) {
			product = new Product();
		}
	}

	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.setPartA("B->A");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.setPartB("B->B");
	}

	@Override
	public void buildPartC() {
		// TODO Auto-generated method stub
		product.setPartC("B->C");
	}

}

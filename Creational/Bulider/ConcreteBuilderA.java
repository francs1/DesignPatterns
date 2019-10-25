package Creational.Bulider;

public class ConcreteBuilderA extends Builder {

	public ConcreteBuilderA() {
		if (product == null) {
			product = new Product();
		}
	}
	
	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.setPartA("A->A");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.setPartB("A->B");
	}

	@Override
	public void buildPartC() {
		// TODO Auto-generated method stub
		product.setPartC("A->C");
	}

}

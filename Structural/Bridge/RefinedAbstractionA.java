package Structural.Bridge;

public class RefinedAbstractionA extends Abstraction {

	protected RefinedAbstractionA(Implementor implementor) {
		super(implementor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		System.out.println("颜色：红色");
		implementor.OperationImpl();
	}

}

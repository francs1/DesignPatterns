package Structural.Bridge;

public class RefinedAbstractionC extends Abstraction {

	protected RefinedAbstractionC(Implementor implementor) {
		super(implementor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		System.out.println("颜色：蓝色");
		implementor.OperationImpl();
	}

}

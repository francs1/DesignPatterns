package Structural.Bridge;

public class RefinedAbstractionB extends Abstraction {

	protected RefinedAbstractionB(Implementor implementor) {
		super(implementor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		System.out.println("颜色：黄色");
		implementor.OperationImpl();
	}

}

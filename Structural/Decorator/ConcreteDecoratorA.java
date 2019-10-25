package Structural.Decorator;

public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public void Operation() {
		super.Operation();
		addedFunction();
	}

	public void addedFunction() {
		System.out.println("添加具体装饰A");
	}
}

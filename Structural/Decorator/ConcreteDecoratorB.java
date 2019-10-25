package Structural.Decorator;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public void Operation() {
		super.Operation();
		addedFunction();
	}

	public void addedFunction() {
		System.out.println("添加具体装饰B");
	}

}

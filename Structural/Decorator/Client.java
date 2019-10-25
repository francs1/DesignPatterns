package Structural.Decorator;

public class Client {

	public static void main(String[] args) {
		//声明组件的对象p，在下面对p进行进一步的"完善"但是不更换p的类型。
		Component p = new ConcreteComponent();
		
		//未添加装饰的调用
		p.Operation();
		
		System.out.println("----------------------");
		//添加具体装饰A
		p = new ConcreteDecoratorA(p);
		p.Operation();
		
		System.out.println("----------------------");
		//在装饰A的基础上，再添加具体装饰B
		p = new ConcreteDecoratorB(p);
		p.Operation();

	}

}

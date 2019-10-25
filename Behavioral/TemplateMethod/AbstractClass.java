package Behavioral.TemplateMethod;

public abstract class AbstractClass {
	//已知<执行顺序>
	public void TemplateMethod() {
		SpecificMethod();
		abstractMethod1();
		abstractMethod2();
	}

	//已知的<具体实现>
	public void SpecificMethod() {
		System.out.println("抽象类中的方法被调用");
	}

	//未知的<具体实现>
	public abstract void abstractMethod1();
	public abstract void abstractMethod2();
}

package Behavioral.TemplateMethod;

public class Client {

	//子类继承父类，通过new出不同的子类实现不同的行为
	public static void main(String[] args) {
		/*设计一个系统时知道了算法所需的关键步骤，
		 * 已知<执行顺序>，
		 * 还未知<某些步骤的具体实现>，
		 * 或者说某些步骤的实现与具体的环境相关。
		 * */
		
		//扩展点
		AbstractClass abstractClass;
		
		//具体实现A
		abstractClass = new ConcreteClassA();
		//切换到具体实现B
		//abstractClass = new ConcreteClassB();
		
		//稳定的代码
		abstractClass.TemplateMethod();
	}

}

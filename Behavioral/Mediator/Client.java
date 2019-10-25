package Behavioral.Mediator;

public class Client {
	/*
	 * 定义一个中介对象来封装一系列对象之间的交互， 使原有对象之间的耦合松散，且可以独立地改变它们之间的交互。
	 */
	public static void main(String[] args) {
		// 声明中介者对象
		Mediator md = new ConcreteMediator();

		// 在中介者的用户列表中进行登记
		Colleague c1 = new ConcreteColleagueA();
		Colleague c2 = new ConcreteColleagueB();
		Colleague c3 = new ConcreteColleagueC();

		md.register(c1);
		md.register(c2);
		md.register(c3);

		// 用户A发送消息
		c1.setMsg("B你退出吧!");
		c1.send();
		
		//用户B退出
		md.remove(c2);
		
		System.out.println("-------------------");
		// 用户C发送消息
		c3.setMsg("B你还在吗？");
		c3.send();
		
	}
}

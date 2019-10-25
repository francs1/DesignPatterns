package Structural.Adapter;

public class Client {

	public static void main(String[] args) {
		//类适配器
		Target target = new ClassAdapter();
		target.request();
		
		System.out.println("----------------");
		// 对象适配器
		Adaptee adaptee = new Adaptee();
		
		//有参构造方法是适配器的一端的"螺丝扣"
		Target adapter = new Adapter(adaptee);
		
		//调用实例方法是适配器的另一端"螺丝扣"
		adapter.request();

	}
}

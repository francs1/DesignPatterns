package Creational.Bulider;

public class Client {

	/*
	 * 产品都是由多个部件构成的，各个部件可以灵活选择，但其创建步骤都大同小异
	 */
	public static void main(String[] args) {
		
		Builder builder;
		
		//扩展点
		builder = new ConcreteBuilderA();
		//切换到B
		//builder = new ConcreteBuilderB();
		
		//稳定代码
		Director director = new Director(builder);
		
		//创建模式，最终得到的对象
		Product product = director.construct();
		product.show();
	}
}

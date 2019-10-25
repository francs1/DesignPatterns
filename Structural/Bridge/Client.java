package Structural.Bridge;

public class Client {

	public static void main(String[] args) {
		//以这两个抽象类型(接口)声明的对象，是稳定的。根据其子类的不同，会有不同的表现。
		Implementor imple;
		Abstraction abs;
		
		//双重扩展点
		//方形+红色
		imple = new ConcreteImplementorA();//方形
		abs = new RefinedAbstractionA(imple);//将"方形"送入"红色"
		
		////圆形+蓝色
		//imple = new ConcreteImplementorB();//圆形
		//abs = new RefinedAbstractionC(imple);//将"圆形"送入"蓝色"
				
		abs.Operation();
		
	}

}

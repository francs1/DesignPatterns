package Structural.Flyweight;

public class Client {
	
	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight f1 = factory.getFlyweight("A");
		f1.operation(new UnsharableFlyweight("第1次调用A"));
		System.out.println("----------------------");
		
		Flyweight f2 = factory.getFlyweight("A");
		f2.operation(new UnsharableFlyweight("第2次调用A"));
		System.out.println("----------------------");
		
		Flyweight f3 = factory.getFlyweight("A");
		f3.operation(new UnsharableFlyweight("第3次调用B"));
		System.out.println("----------------------");
		
		Flyweight f4 = factory.getFlyweight("B");
		f4.operation(new UnsharableFlyweight("第1次调用B"));
		System.out.println("----------------------");
		
		Flyweight f5 = factory.getFlyweight("B");
		f5.operation(new UnsharableFlyweight("第2次调用B"));
		System.out.println("----------------------");
		
	}
}

package Structural.Flyweight;

public class ConcreteFlyweightA implements Flyweight {

	private String key;

	public ConcreteFlyweightA(String key) {
		this.key = key;
	}

	@Override
	public void operation(UnsharableFlyweight unsharableFlyweight) {
		System.out.print("具体享元" + key + "被调用，");
		System.out.println("非享元信息是:" + unsharableFlyweight.getInfo());
	}

}

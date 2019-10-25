package Structural.Flyweight;

public class ConcreteFlyweightB implements Flyweight {

	private String key;

	public ConcreteFlyweightB(String key) {
		this.key = key;
	}
	@Override
	public void operation(UnsharableFlyweight unsharableFlyweight) {
		// TODO Auto-generated method stub
		System.out.print("具体享元" + key + "被调用，");
		System.out.println("非享元信息是:" + unsharableFlyweight.getInfo());
	}

}

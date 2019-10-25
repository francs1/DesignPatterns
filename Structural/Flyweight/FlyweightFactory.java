package Structural.Flyweight;

import java.util.HashMap;

public class FlyweightFactory {

	private HashMap<String, Flyweight> flyweights;

	public FlyweightFactory() {
		flyweights = new HashMap<String, Flyweight>();
		flyweights.put("A", null);
		flyweights.put("B", null);
	}

	public Flyweight getFlyweight(String key) {
		Flyweight flyweight = (Flyweight) flyweights.get(key);
		if (flyweight != null) {
			System.out.println("具体享元" + key + "已经存在，直接返回");
		} else {
			if (key == "A") {
				System.out.println("具体享元" + key + "不存在，新生成A");
				flyweight = new ConcreteFlyweightA(key);
				flyweights.put(key, flyweight);
			} else {
				System.out.println("具体享元" + key + "不存在，新生成B");
				flyweight = new ConcreteFlyweightB(key);
				flyweights.put(key, flyweight);
			}
		}
		return flyweight;
	}
}

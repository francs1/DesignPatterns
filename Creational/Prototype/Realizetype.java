package Creational.Prototype;

public class Realizetype implements Cloneable {
//public class Realizetype {
	Realizetype() {
		System.out.println("具体原型创建成功！");
	}

	public Object clone() throws CloneNotSupportedException {
		System.out.println("具体原型复制成功！");
		return (Realizetype) super.clone();
	}
}

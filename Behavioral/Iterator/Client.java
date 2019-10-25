package Behavioral.Iterator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//声明聚合对象
		Aggregate ag = new ConcreteAggregate();
		
		//添加元素
		ag.add("1");
		ag.add("2");
		ag.add("3");
		//获取迭代器
		Iterator it = ag.getIterator();
		
		//迭代
		while (it.hasNext()) {
			Object ob = it.next();
			System.out.print(ob.toString() + " ");
		}
		
		//访问
		Object ob = it.first();
		System.out.println("\n第一个元素：" + ob.toString());
	}

}

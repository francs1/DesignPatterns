package Behavioral.Visitor;

public class Client {

	//Visitor是角色
	//Element是域模型
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 声明数据结构
		ObjectStructure os = new ObjectStructure();
		
		//数据结构中添加元素
		os.add(new ConcreteElementA());
		os.add(new ConcreteElementB());
		
		//访问者A访问数据结构
		Visitor visitor = new ConcreteVisitorA();
		os.accept(visitor);
		
		System.out.println("------------------------");
		
		//访问者B访问数据结构
		visitor = new ConcreteVisitorB();
		os.accept(visitor);
	}

}

package Behavioral.Visitor;

public class ConcreteElementA implements Element {
	
	public String ID;
	
	public String Name;
	
	public void accept(Visitor visitor)
    {
		//具体访问者ConcreteVisitorA
        visitor.visit(this);
    }
    public String operationA()
    {
        return "具体元素A的操作。";
    }
}

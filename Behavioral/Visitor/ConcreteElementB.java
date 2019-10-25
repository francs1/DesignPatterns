package Behavioral.Visitor;

public class ConcreteElementB implements Element {
	
	public int Age;
	
	public void accept(Visitor visitor)
    {
		//具体访问者ConcreteVisitorB
        visitor.visit(this);
    }
    public String operationB()
    {
        return "具体元素B的操作。";
    }
}

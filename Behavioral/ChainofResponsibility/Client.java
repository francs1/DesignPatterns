package Behavioral.ChainofResponsibility;

//责任链
public class Client {

	public static void main(String[] args) {
		//定义责任
		Handler handlerA = new ConcreteHandlerA();
		Handler handlerB = new ConcreteHandlerB();
		Handler handlerC = new ConcreteHandlerC();
		
		//设置责任链顺序
		handlerA.setNext(handlerB);
		handlerB.setNext(handlerC);
		
		//提交任务请求
		handlerA.handleRequest("D");
	}

}

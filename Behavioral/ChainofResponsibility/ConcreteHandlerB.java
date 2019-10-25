package Behavioral.ChainofResponsibility;

public class ConcreteHandlerB extends Handler {

	@Override
	public void handleRequest(String request) {
		// TODO Auto-generated method stub
		System.out.println("B接受任务");
		if (request == "B") {
			System.out.println("任务已经由<" + this.getClass().getName() + ">处理");
		} else {
			System.out.println("任务B->C");
			Handler nexthandler = getNext();
			nexthandler.handleRequest(request);
		}
	}

}

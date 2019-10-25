package Behavioral.ChainofResponsibility;

public class ConcreteHandlerA extends Handler {

	@Override
	public void handleRequest(String request) {
		// TODO Auto-generated method stub
		System.out.println("A接受任务");
		if (request == "A") {
			System.out.println("任务已经由<" + this.getClass().getName() + ">处理");
		} else {
			System.out.println("任务A->B");
			Handler nexthandler = getNext();
			nexthandler.handleRequest(request);
		}
	}

}

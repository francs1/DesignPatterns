package Behavioral.ChainofResponsibility;

public class ConcreteHandlerC extends Handler {

	@Override
	public void handleRequest(String request) {
		// TODO Auto-generated method stub
		System.out.println("C接受任务");
		if (request == "C") {
			System.out.println("任务已经由<" + this.getClass().getName() + ">处理");
		} else {
			System.out.println("任务处理失败，无后续任务接管");
			//setNext(new ConcreteHandlerC());
		}
	}

}

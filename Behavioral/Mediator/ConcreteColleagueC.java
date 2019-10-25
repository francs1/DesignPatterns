package Behavioral.Mediator;

public class ConcreteColleagueC extends Colleague {

	@Override
	public void receive() {
		System.out.println("C收到请求<-" + getMsg());

	}

	@Override
	public void send() {
		System.out.println("C发出请求->" + getMsg());
		mediator.relay(this); // 请中介者转发

	}

}

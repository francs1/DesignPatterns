package Behavioral.Mediator;

public class ConcreteColleagueB extends Colleague {

	@Override
	public void receive() {
		System.out.println("B收到请求<-" + getMsg());
	}

	@Override
	public void send() {
		System.out.println("B发出请求->" + getMsg());
		mediator.relay(this); // 请中介者转发
	}

}

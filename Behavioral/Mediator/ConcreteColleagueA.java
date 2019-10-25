package Behavioral.Mediator;

public class ConcreteColleagueA extends Colleague {

	@Override
	public void receive() {
		System.out.println("A收到请求<-" + getMsg());
	}

	@Override
	public void send() {
		System.out.println("A发出请求->" + getMsg());
		mediator.relay(this); // 请中介者转发
	}

}

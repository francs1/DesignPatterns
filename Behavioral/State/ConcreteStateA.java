package Behavioral.State;

public class ConcreteStateA extends State {

	@Override
	public void Handle(Context context) {
		// TODO Auto-generated method stub
		System.out.println("当前状态是A,已转移到状态B");
		// 切换到状态B
		context.setState(new ConcreteStateB());
	}

}

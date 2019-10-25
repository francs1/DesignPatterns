package Behavioral.State;

public class ConcreteStateB extends State {

	@Override
	public void Handle(Context context) {
		// TODO Auto-generated method stub
		System.out.println("当前状态是B,已转移到状态A");
		//切换到状态A
		context.setState(new ConcreteStateA());
	}

}

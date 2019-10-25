package Behavioral.Command;

public class ConcreteCommandB implements Command {

	private ReceiverB receiver;

	public ConcreteCommandB() {
		receiver = new ReceiverB();
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.action();
	}

}

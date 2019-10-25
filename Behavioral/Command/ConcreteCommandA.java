package Behavioral.Command;

public class ConcreteCommandA implements Command {

	private ReceiverA receiver;

	public ConcreteCommandA() {
		receiver = new ReceiverA();
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		receiver.action();
	}

}

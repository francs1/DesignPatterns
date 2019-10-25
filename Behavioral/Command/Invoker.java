package Behavioral.Command;

public class Invoker {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public Invoker(Command command) {
		this.command = command;
	}

	public void cell() {
		command.execute();
	}

}

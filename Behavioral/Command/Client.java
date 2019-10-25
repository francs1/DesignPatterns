package Behavioral.Command;

public class Client {
	/*
	 * 命令对象command中包含了具体的操作，
	 * 客户端只需要调用命令，无需关心具体的操作。
	 */
	public static void main(String[] args) {
		//扩展点
		Command command;

		//使用命令A
		command = new ConcreteCommandA();

		//稳定代码
		Invoker invoker = new Invoker(command);
		invoker.cell();
		
		//切换命令B
		command = new ConcreteCommandB();
		invoker.setCommand(command);
		invoker.cell();
	}
}

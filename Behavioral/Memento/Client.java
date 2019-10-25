package Behavioral.Memento;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Originator or = new Originator();

		or.setState("S0");
		System.out.println("初始状态:" + or.getState());

		Caretaker cr = new Caretaker();
		Memento memento1 = or.createMemento();// 保存状态
		cr.Push(memento1); // SAVE

		or.setState("S1");
		System.out.println("新的状态:" + or.getState());

		Memento memento2 = cr.Pop();// 恢复状态
		or.restoreMemento(memento2);// LOAD
		System.out.println("恢复状态:" + or.getState());
	}
}

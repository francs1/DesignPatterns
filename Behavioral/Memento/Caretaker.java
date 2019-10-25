package Behavioral.Memento;

import java.util.Stack;

//状态集
public class Caretaker {

//	private Memento memento;

//	public void setMemento(Memento m) {
//		memento = m;
//	}

//	public Memento getMemento() {
//		return memento;
//	}

	private Stack<Memento> mementos;

	public Caretaker() {
		if (mementos == null) {
			mementos = new Stack<Memento>();
		}
	}

	public void Push(Memento m) {
		mementos.add(m);
	}

	public Memento Pop() {
		if (mementos != null && !mementos.empty()) {
			return mementos.pop();
		} else {
			return null;
		}
	}
}

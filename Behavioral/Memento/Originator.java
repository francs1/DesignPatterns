package Behavioral.Memento;

//记录当前时刻的内部状态信息BLL
public class Originator {

	private String state;

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	// 使用当前状态创建副本
	public Memento createMemento() {
		return new Memento(state);
	}

	// 从副本中恢复状态
	public void restoreMemento(Memento m) {
		this.setState(m.getState());
	}
}

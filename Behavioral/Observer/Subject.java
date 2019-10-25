package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	//订阅者列表
	protected List<Observer> observers = new ArrayList<Observer>();

	public void add(Observer oberser) {
		observers.add(oberser);
	}

	public void remove(Observer observer) {
		observers.remove(observer);
	}

	public abstract void notifyObserver();
}

package Behavioral.Observer;

public class ConcreteSubject extends Subject {

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		System.out.println("具体目标发生改变...");
		System.out.println("--------------");

		for (Observer obs : observers) {
			obs.response();
		}
	}

}

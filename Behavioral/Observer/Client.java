package Behavioral.Observer;

public class Client {

	/*
	 * 指多个对象间存在一对多的依赖关系，
	 * 当一个对象的状态发生改变时，
	 * [所有]依赖于它的对象都得到通知并被自动更新。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//主题
		Subject subject = new ConcreteSubject();
		//观察者A，订阅主题
		Observer observerA = new ConcreteObserverA();
		subject.add(observerA);
		
		//观察者B，订阅主题
		Observer observerB = new ConcreteObserverB();
		subject.add(observerB);
		
		//主题对观察者进行通知
		subject.notifyObserver();
	}

}

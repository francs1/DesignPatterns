package Structural.Proxy;

public class RealSubject implements Subject {

	@Override
	public void Request() {
		// TODO Auto-generated method stub
		System.out.println("原生实现");
	}

}

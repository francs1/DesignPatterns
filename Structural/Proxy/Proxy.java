package Structural.Proxy;

public class Proxy implements Subject {
	private RealSubject realsubject = new RealSubject();

	public Proxy() {
		if (realsubject == null) {
			realsubject = new RealSubject();
		}
	}

	@Override
	public void Request() {
		// TODO Auto-generated method stub
		PreRequest();
		realsubject.Request();
		PostRequest();
	}

	public void PreRequest() {
		System.out.println("预处理");
	}

	public void PostRequest() {
		System.out.println("后处理");
	}

}

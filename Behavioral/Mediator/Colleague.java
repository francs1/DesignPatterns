package Behavioral.Mediator;

public abstract class Colleague {
	protected Mediator mediator;
	
	private String Msg;

	public String getMsg() {
		return Msg;
	}

	public void setMsg(String msg) {
		Msg = msg;
	}

	public void setMedium(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public abstract void receive();
	
	public abstract void send();

}

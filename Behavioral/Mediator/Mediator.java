package Behavioral.Mediator;

public abstract class Mediator {

	public abstract void register(Colleague colleague);
	
	public abstract void remove(Colleague colleague);

	public abstract void relay(Colleague colleague);
}

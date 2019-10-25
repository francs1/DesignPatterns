package Behavioral.Mediator;

import java.util.List;
import java.util.ArrayList;

public class ConcreteMediator extends Mediator {

	private List<Colleague> colleagues = new ArrayList<Colleague>();

	@Override
	public void register(Colleague colleague) {
		// TODO Auto-generated method stub
		if (!colleagues.contains(colleague)) {
			colleagues.add(colleague);
			colleague.setMedium(this);
		}
	}

	@Override
	public void remove(Colleague colleague) {
		// TODO Auto-generated method stub
		if (colleagues.contains(colleague)) {
			colleagues.remove(colleague);
		}
	}

	@Override
	public void relay(Colleague colleague) {
		// TODO Auto-generated method stub
		for (Colleague cl : colleagues) {
			if (!cl.equals(colleague)) {
				cl.setMsg(colleague.getMsg());
				cl.receive();
			}
		}
	}

}

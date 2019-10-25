package Behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
	private List<Object> list = new ArrayList<Object>();

	public void add(Object obj) {
		list.add(obj);
	}
	
	public void remove(Object obj) {
		list.remove(obj);
	}

	public Iterator getIterator() {
		Iterator i️terator = new ConcreteIterator(list);
		return i️terator;
	}
}

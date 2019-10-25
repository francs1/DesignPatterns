package Behavioral.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//材料集Element-Set
public class ObjectStructure {
	private List<Element> list = new ArrayList<Element>();

	// 指定一个Visitor，由其访问列表list中的每一个元素
	public void accept(Visitor visitor) {
		Iterator<Element> i = list.iterator();
		while (i.hasNext()) {
			Element element = i.next();
			element.accept(visitor);
		}
	}

	public void add(Element element) {
		list.add(element);
	}

	public void remove(Element element) {
		list.remove(element);
	}
}

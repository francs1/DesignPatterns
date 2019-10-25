package Structural.Composite;

import java.util.ArrayList;

public class Composite implements Component {

	private ArrayList<Component> children = new ArrayList<Component>();

	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
		children.add(component);
	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
		children.remove(component);
	}

	@Override
	public Component getChile(int t) {
		// TODO Auto-generated method stub
		return children.get(t);
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		for (Object obj : children) {
			((Component) obj).operation();
		}
	}

}

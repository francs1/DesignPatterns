package Structural.Composite;

public class Leaf implements Component {

	private String name;

	public Leaf(String name) {
		this.name = name;
	}

	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub

	}

	@Override
	public Component getChile(int t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("树叶" + name + "被访问");
	}

}

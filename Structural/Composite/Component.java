package Structural.Composite;

public interface Component {
	public void add(Component component);

	public void remove(Component component);

	public Component getChile(int t);

	public void operation();

}

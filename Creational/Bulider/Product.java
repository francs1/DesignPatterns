package Creational.Bulider;

public class Product {
	private String partA;
	private String partB;
	private String partC;

	public void setPartA(String partA) {
		this.partA = partA;
	}

	public void setPartB(String partB) {
		this.partB = partB;
	}

	public void setPartC(String partC) {
		this.partC = partC;
	}

	public void show() {
		System.out.println(this.partA + "|" + this.partB + "|" + this.partC);
	}
}

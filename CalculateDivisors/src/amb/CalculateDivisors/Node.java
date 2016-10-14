package amb.CalculateDivisors;

public class Node {
	
	private int number;
	private Node child1;
	private Node child2;
	
	public Node() {	
	}
	
	public Node(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Node getChild1() {
		return child1;
	}

	public void setChild1(Node child1) {
		this.child1 = child1;
	}

	public Node getChild2() {
		return child2;
	}

	public void setChild2(Node child2) {
		this.child2 = child2;
	}
	
	

}

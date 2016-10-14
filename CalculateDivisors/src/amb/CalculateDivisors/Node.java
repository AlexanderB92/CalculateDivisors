package amb.CalculateDivisors;

public class Node {
	
	private int number;
	private int child1;
	private int child2;
	
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

	public int getChild1() {
		return child1;
	}

	public void setChild1(int child1) {
		this.child1 = child1;
	}

	public int getChild2() {
		return child2;
	}

	public void setChild2(int child2) {
		this.child2 = child2;
	}
	
	

}

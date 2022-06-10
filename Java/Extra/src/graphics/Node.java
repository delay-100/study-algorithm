package graphics;


public class Node {
	boolean visited;
	int own;
	
	public Node(int own) {
		visited = false;
		this.own = own;
	}
	
	public void visitedGoTrue() {
		this.visited = true;
	}
	
	public boolean visited() {
		return visited;
	}
	
	public int own() {
		return own;
	}

	
}

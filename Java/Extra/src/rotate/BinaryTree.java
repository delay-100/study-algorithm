package rotate;

public class BinaryTree<E> {
	public class BTNode<E> {
		protected BTNode<E> left, right;
		protected E data;

		public BTNode() {
			left = null;
			right = null;
			data = null;
		}

		public BTNode(E n) {
			left = null;
			right = null;
			this.data = n;
		}

		public E getData() {
			return data;
		}

		public BTNode<E> getRight() {
			return right;
		}

		public BTNode<E> getLeft() {
			return left;
		}

	}

	protected BTNode<E> root;

	public BinaryTree() {
		root = null;
	}

	protected BinaryTree(BTNode<E> root) {
		this.root = root;
	}

	public BinaryTree(E data, BinaryTree<E> leftTree, BinaryTree<E> rightTree) {
		root = new BTNode<E>(data);
		if (leftTree != null) {
			root.left = leftTree.root;
		} else {
			root.left = null;
		}
		if (rightTree != null) {
			root.right = rightTree.root;
		} else {
			root.right = null;
		}
	}

	public void insert(E data) {
		root = insert(root, data);
	}

	private BTNode insert(BTNode node, E data) {
		if (node == null)
			node = new BTNode(data);
		else {
			if (node.getRight() == null)
				node.right = insert(node.right, data);
			else
				node.left = insert(node.left, data);
		}
		return node;
	}

	public E getData() {
		return root.getData();
	}

	public void inorder() {
		inorder(root);
	}

	private void inorder(BTNode r) {
		if (r != null) {
			inorder(r.getLeft());
			System.out.print(r.getData() + " ");
			inorder(r.getRight());
		}
	}

	public void preorder() {
		preorder(root);
	}

	public void preorder(BTNode r) {
		if (r != null) {
			System.out.print(r.getData() + " ");
			preorder(r.getLeft());
			preorder(r.getRight());
		}
	}

	public void postorder() {
		postorder(root);
	}

	Object reroot = -1;

	public void postorder(BTNode r) {
		if (r != null) {
			postorder(r.getLeft());
			postorder(r.getRight());
			System.out.print(r.getData() + " ");
			reroot = r.getData();
		}
	}

	public int root() {
		return (int) reroot;

	}

	public Object rr(BTNode r) {
		Object temp = r.getLeft();
		return temp;
	}

	public void rotateLeft() {

		BinaryTree<E>.BTNode<E> temp1 = root;
		BinaryTree<E>.BTNode<E> temp2 = root.right;
		BinaryTree<E>.BTNode<E> temp3 = temp2.left;

		root = temp2;
		temp2.left = temp1;
		temp1.right = temp3;

	}

	public void rotateRight() {
		BinaryTree<E>.BTNode<E> temp1 = root;
		BinaryTree<E>.BTNode<E> temp2 = root.left;
		BinaryTree<E>.BTNode<E> temp3 = temp2.right;

		root = temp2;
		temp2.right = temp1;
		temp1.left = temp3;

	}
}

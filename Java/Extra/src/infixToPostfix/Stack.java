package infixToPostfix;

import java.util.Scanner;

//SingleLinkedList를 사용하여 Stack 구현하기
public class Stack<E> {

	private Node<E> head = null;
	private int size;
	private Node<E> top;

	public Stack() {
		head = null;
		size = 0;
		top = null;
	}

	public void addFirst(E item) {
		head = new Node<E>(item, head);
		top = head.next;
		size++;
	}

	public void traverse() {
		Node<E> nodeRef = head;
		while (nodeRef != null) {
			System.out.print(nodeRef.data + " ");	
			nodeRef = nodeRef.next;
		}
		System.out.println();
	}

	public E get(int index) {
		Node<E> node = getNode(index);
		return node.data;
	}

	public E set(int index, E newValue) {
		Node<E> node = getNode(index);
		E result = node.data;
		node.data = newValue;
		return result;
	}

	public boolean remove(int index) {
		Node<E> curr = head;
		if (index == 0) {
			head = head.next;
			return true;
		} else {
			for (int i = 1; i < index; i++) {
				if (curr.getNext() == null)
					return false;
				curr = curr.getNext();
			}
			curr.setNext(curr.getNext().getNext());
			size--;
			return true;
		}
	}

	public void add(int index, E item) {
		if (index == 0)
			addFirst(item);
		else {
			Node<E> node = getNode(index - 1);
			addAfter(node, item);
		}
	}

	// 맨 위의 값을 추출 후 삭제함
	public E pop() {
		if (size != 0) {
			E data = head.data; // 현재 head의 data를 반환함
			top = head.next; // head의 다음 node를 top으로 만들어줌
			head = head.next; // head의 다음 node를 head로 만들어줌
			size--;
			return data;
		} else
			return null;
	}

	// 맨 위의 값을 추출함
	public E peek() {
		if (size != 0)
			return top.data;
		else
			return null;
	}

	// Stack의 맨 위(Top)에 입력
	public void push(E item) {
		Node<E> temp = head; // head를 temp라는 임시 Node를 가리키게 함
		head = new Node<E>(item); // 새로운 head를 item을 넣어 만듦
		addAfter(head, item); // head노드의 다음에 item을 저장함
		head.next = temp; // 임시 Node에 넣어둔 기존의 head를 새로운 head가 가리키게 함
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	private Node<E> getNode(int index) {
		Node<E> node = head;
		for (int i = 0; i < index && node != null; i++)
			node = node.next;
		return node;
	}

	private void addAfter(Node<E> node, E item) {
		node.next = new Node<E>(item, node.next);
		size++;
		top = node.next;
	}

	private static class Node<E> {
		private E data;
		private Node<E> next;

		private Node(E dataItem) {
			data = dataItem;
			next = null;
		}

		private Node(E dataItem, Node<E> nodeRef) {
			data = dataItem;
			next = nodeRef;
		}

		private Node<E> getNext() {
			return next;
		}

		private void setNext(Node nextNode) {
			this.next = nextNode;
		}

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Stack<Integer> List = new Stack<Integer>();

		while (true) {
			System.out.println("Command : [ push | pop | peek | empty | size | exit ]");
			String s = input.next();

			if (s.equals("push")) {
				int n = input.nextInt();
				List.push(n);
				List.traverse();
			} else if (s.equals("pop")) {
				System.out.println(List.pop());
				List.traverse();
			} else if (s.equals("peek")) {
				System.out.println(List.peek());
				List.traverse();
			} else if (s.equals("empty")) {
				System.out.println(List.isEmpty());
			} else if (s.equals("size")) {
				System.out.println(List.getSize());
			} else if (s.equals("exit"))
				break;

		}
		input.close();
	}


}

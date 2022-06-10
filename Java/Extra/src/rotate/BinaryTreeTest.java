package rotate;

import java.util.Scanner;

public class BinaryTreeTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BinaryTree<Integer> bt = new BinaryTree<Integer>();

		System.out.println("트리에 들어갈 정수를 입력해주세요. 범위{0 ~ 9}, 최대 10개. 종료시 'end' 입력");
		for (int i = 0; i < 10; i++) {
			String temp = input.next();
			if (temp.equals("end"))
				break;
			else
				bt.insert(Integer.parseInt(temp));
		}
		System.out.print("Postorder : ");
		bt.postorder();
		System.out.print("inorder : ");
		bt.inorder();
		System.out.print("preorder : ");
		bt.preorder();
		System.out.println();

		while (true) {
			try {
			System.out.println("----------------------");
			System.out.println("choose rotate BinaryTree command : | RR | RL | end | ");

			String command = input.next();
			int bfroot = bt.root();
			int afroot = -1;
			if (command.equals("RR") || command.equals("rr")) {
				System.out.println("Rotate Right");
				bt.rotateRight();
				afroot = bt.root();
			} else if (command.equals("RL") || command.equals("rl")) {
				System.out.println("Rotate Left");
				bt.rotateLeft();
				afroot = bt.root();
			} else if (command.equals("end"))
				break;
			System.out.print("\nPostorder : ");
			bt.postorder();
			System.out.print("inorder : ");
			bt.inorder();
			System.out.println();
			afroot = bt.root();
			System.out.print("bf root : " + bfroot + "\naf root : " + afroot);

			System.out.println();
			}
			catch(NullPointerException e) {
				System.out.println("Rotate 동작이 불가능합니다.");
			}
		}
		input.close();
	}
}

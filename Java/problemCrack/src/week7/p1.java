package week7;

// 7���� 1�� ������ ���� Ʋ�� �����ϱ� ������ ǥ���˻翡�� ���� Ʋ�� �׷��� ����ص� ǥ���˻翡���� ���� �����ϴ�.
import java.util.*;

public class p1 {
	static List<Integer> num; // ������ ���ҵ��� �����ϱ� ���� ����Ʈ
	static int[] subset; // �κ� ������ �����ϱ� ���� �迭

	/**
	 * ��� ȣ���� ����Ͽ� ũ�Ⱑ subset_size�� ��� �κ� ������ ���
	 * 
	 * @param num_idx     num ����Ʈ������ ���� �ε���
	 * @param subset_idx  subset �迭������ ���� �ε���
	 * @param subset_size �κ� ������ ũ��
	 */
	public static void solve(int num_idx, int subset_idx, int subset_size) {
		if (subset_idx == subset_size) {
			print(subset_idx);
			return;
		}
		for (int i = num_idx; i < num.size(); i++) {
			subset[subset_idx] = num.get(i);
			solve(i+1, subset_idx + 1, subset_size);
		}
	}

	private static void print(int subset_idx) {
		System.out.print("{ ");
		for (int i = 0; i < subset_idx; i++) {
				System.out.print(subset[i] + " ");
		}
		System.out.println("}");
	}

	public static void main(String[] args) {
		/* �ʿ��� �ڵ带 �߰��Ͻÿ� */
		Scanner input = new Scanner(System.in);

		num = new ArrayList<Integer>();
		String s = input.nextLine();
		String[] sc = s.split(" ");

		for (int i = 0; i < sc.length; i++) {
			num.add(Integer.parseInt(sc[i]));
		}
		subset = new int[num.size()];
		for (int i = 0; i <= num.size(); i++) {
			solve(0, 0, i);
		}

		/* �ʿ��� �ڵ带 �߰��Ͻÿ� */
		input.close();
	}

}

package week7;

// 7주차 1번 문제는 정답 틀을 제공하기 때문에 표절검사에서 정답 틀을 그래도 사용해도 표절검사에서는 문제 없습니다.
import java.util.*;

public class p1 {
	static List<Integer> num; // 집합의 원소들을 저장하기 위한 리스트
	static int[] subset; // 부분 집합을 저장하기 위한 배열

	/**
	 * 재귀 호출을 사용하여 크기가 subset_size인 모든 부분 집합을 출력
	 * 
	 * @param num_idx     num 리스트에서의 현재 인덱스
	 * @param subset_idx  subset 배열에서의 현재 인덱스
	 * @param subset_size 부분 집합의 크기
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
		/* 필요한 코드를 추가하시오 */
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

		/* 필요한 코드를 추가하시오 */
		input.close();
	}

}

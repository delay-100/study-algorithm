package week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class p3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		ArrayList<Country> list = new ArrayList<Country>();
		for (int i = 0; i < n; i++)
			list.add(new Country(input.next(), n, i));

		int num = 0;
		for (int i = 0; i < n; i++) {
			num += i;
		}
		for (int i = 0; i < num; i++) {
			String s1 = input.next();
			String score = input.next();
			String s2 = input.next();
			String[] sc = score.split(":");
			int[] scnum = new int[2];
			for (int j = 0; j < 2; j++) {
				scnum[j] = Integer.parseInt(sc[j]);
			}
			int firstindex = 0;
			int secondindex = 0;
			for (int j = 0; j < n; j++) {
				if (list.get(j).getname().equals(s1)) {
					firstindex = j;
					break;
				}
			}
			for (int j = 0; j < n; j++) {
				if (list.get(j).getname().equals(s2)) {
					secondindex = j;
					break;
				}
			}
			if (scnum[0] > scnum[1]) {
				list.get(firstindex).putwin(1);
				list.get(secondindex).putlose(1);
				list.get(secondindex).putindex(firstindex);
			} else {
				list.get(secondindex).putwin(1);
				list.get(firstindex).putlose(1);
				list.get(firstindex).putindex(secondindex);
			}

			list.get(firstindex).putwinset(scnum[0]);
			list.get(secondindex).putwinset(scnum[1]);
			list.get(firstindex).putloseset(scnum[1]);
			list.get(secondindex).putloseset(scnum[0]);
		}

		for (int i = 0; i < n; i++) {
			list.get(i).putresult(list.get(i).getwinset() + list.get(i).getloseset());
		}

		Collections.sort(list, new Comparator<Country>() {
			@Override
			public int compare(Country o1, Country o2) {
				if (o1.getwin() > o2.getwin()) {
					return -1;
				} else if (o1.getwin() < o2.getwin()) {
					return 1;
				} else {
					if (o1.getresult() > o2.getresult()) {
						return -1;
					} else if (o1.getresult() < o2.getresult()) {
						return 1;
					} else {
						if (o1.getindexValue(o2.getindex()) > o2.getindexValue(o1.getindex())) {
							return 1;
						} else if (o1.getindexValue(o2.getindex()) < o2.getindexValue(o1.getindex())) {
							return -1;
						}
						return 0;

					}
				}
			}
		});

		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + list.get(i).toString());
		}

		input.close();
	}
}

class Country {
	private String name;
	private int win;
	private int lose;
	private int winset;
	private int loseset;
	private int result;
	private int[] list;
	private int index;

	public Country(String name, int n, int index) {
		this.name = name;
		this.win = 0;
		this.lose = 0;
		this.winset = 0;
		this.loseset = 0;
		this.result = 0;
		this.list = new int[n];
		this.index = index;
	}

	public void putindex(int index) {
		this.list[index]++;
	}

	public int getindexValue(int index) {
		return this.list[index];
	}

	public int getindex() {
		return this.index;
	}

	public String getname() {
		return this.name;
	}

	public void putwin(int win) {
		this.win += win;
	}

	public int getwin() {
		return this.win;
	}

	public void putlose(int lose) {
		this.lose += lose;
	}

	public int getlose() {
		return this.lose;
	}

	public void putwinset(int winset) {
		this.winset += winset;
	}

	public int getwinset() {
		return this.winset;
	}

	public void putloseset(int loseset) {
		this.loseset -= loseset;
	}

	public int getloseset() {
		return this.loseset;
	}

	public void putresult(int result) {
		this.result = result;
	}

	public int getresult() {
		return this.result;
	}

	public String toString() {
		if(loseset==0) {
			return ") " + name + " " + win + " " + lose + " " + winset + "-" + loseset + " " + result;
		}
		return ") " + name + " " + win + " " + lose + " " + winset + "" + loseset + " " + result;

	}
}

package week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class p1 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		ArrayList<Box> list = new ArrayList<Box>();

		for (int i = 0; i < n; i++) {
			String s = input.nextLine();
			String[] ss = s.split(" ");
			String[] sss = ss[1].split("/");
			if (sss[1].length() == 1)
				sss[1] = "0" + sss[1];
			list.add(new Box(ss[0], sss[2] + "-" + sss[1] + "-" + sss[0], Integer.parseInt(sss[2]),
					Integer.parseInt(sss[1]), Integer.parseInt(sss[0])));
		}

		Collections.sort(list, new Comparator() {
			public int compare(Object b1, Object b2) {
				return ((Box) b1).getdate().compareTo(((Box) b2).getdate());
			}
		});
		for (int i = 0; i < n; i++) {
			if (list.get(i).getyear() <= 2016 && list.get(i).getyear() >= 1990) {
				list.get(i).setdate("0");
			} else if (list.get(i).getyear() <= 2017 && list.get(i).getmonth() <= 10 && list.get(i).getdate2() <= 18) {
				list.get(i).setdate("0");
			}
		}

		Collections.sort(list, new Comparator() {
			public int compare(Object b1, Object b2) {
				return ((Box) b1).getname().compareTo(((Box) b2).getname());
			}
		});

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getdate() != "0")
				System.out.println(list.get(i).toString());
		}

		input.close();
	}

}

class Box {
	private String name;
	private String date;
	private int year;
	private int month;
	private int date2;

	public Box(String name, String date, int year, int month, int date2) {
		this.name = name;
		this.date = date;
		this.year = year;
		this.month = month;
		this.date2 = date2;
	}

	public void setmonth(int month) {
		this.month = month;
	}

	public int getmonth() {
		return this.month;
	}

	public void setyear(int year) {
		this.year = year;
	}

	public int getyear() {
		return this.year;
	}

	public void setdate2(int date2) {
		this.date2 = date2;
	}

	public int getdate2() {
		return this.date2;
	}

	public void setdate(String date) {
		this.date = date;
	}

	public String getdate() {
		return this.date;
	}

	public String getname() {
		return this.name;
	}

	public String toString() {
		String[] d = date.split("-");
		if (d[1].startsWith("0"))
			d[1] = d[1].substring(1);
		return name + " " + d[2] + "/" + d[1] + "/" + d[0];

	}
}

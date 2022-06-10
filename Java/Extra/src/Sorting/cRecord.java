package Sorting;

public class cRecord {
	char grade;
	int penalty;
	String name;
	
	public cRecord(char grade, int penalty, String name) {
		this.grade = grade;
		this.penalty = penalty;
		this.name= name;
	}

	public char grade() {
		return grade;
	}
	public int penalty() {
		return penalty;
	}	
	public String name() {
		return name;
	}
}

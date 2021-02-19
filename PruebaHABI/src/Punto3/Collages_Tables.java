package Punto3;

public class Collages_Tables {
	private int college_id;
	private int contest_id;
	public Collages_Tables() {
		super();
	}
	public Collages_Tables(int college_id, int contest_id) {
		super();
		this.college_id = college_id;
		this.contest_id = contest_id;
	}
	public int getCollege_id() {
		return college_id;
	}
	public void setCollege_id(int college_id) {
		this.college_id = college_id;
	}
	public int getContest_id() {
		return contest_id;
	}
	public void setContest_id(int contest_id) {
		this.contest_id = contest_id;
	}
	
}

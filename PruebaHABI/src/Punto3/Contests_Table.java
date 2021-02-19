package Punto3;

public class Contests_Table {
	private int contest_id;
	private int hacker_id;
	private String name;
	public Contests_Table() {
		super();
	}
	public Contests_Table(int contest_id, int hacker_id, String name) {
		super();
		this.contest_id = contest_id;
		this.hacker_id = hacker_id;
		this.name = name;
	}
	public int getContest_id() {
		return contest_id;
	}
	public void setContest_id(int contest_id) {
		this.contest_id = contest_id;
	}
	public int getHacker_id() {
		return hacker_id;
	}
	public void setHacker_id(int hacker_id) {
		this.hacker_id = hacker_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

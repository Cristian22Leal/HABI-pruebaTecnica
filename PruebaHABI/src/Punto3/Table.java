package Punto3;

public class Table {
	private int challenge_id;
	private int college_id;
	public Table() {
		super();
	}
	public Table(int challenge_id, int college_id) {
		super();
		this.challenge_id = challenge_id;
		this.college_id = college_id;
	}
	public int getChallenge_id() {
		return challenge_id;
	}
	public void setChallenge_id(int challenge_id) {
		this.challenge_id = challenge_id;
	}
	public int getCollege_id() {
		return college_id;
	}
	public void setCollege_id(int college_id) {
		this.college_id = college_id;
	}
	
}

package Punto3;

public class Submission_Stats_Table {
	private int challenge_id;
	private int total_submissions;
	private int total_accepted_submissions;
	public Submission_Stats_Table() {
		super();
	}
	public Submission_Stats_Table(int challenge_id, int total_submissions, int total_accepted_submissions) {
		super();
		this.challenge_id = challenge_id;
		this.total_submissions = total_submissions;
		this.total_accepted_submissions = total_accepted_submissions;
	}
	public int getChallenge_id() {
		return challenge_id;
	}
	public void setChallenge_id(int challenge_id) {
		this.challenge_id = challenge_id;
	}
	public int getTotal_submissions() {
		return total_submissions;
	}
	public void setTotal_submissions(int total_submissions) {
		this.total_submissions = total_submissions;
	}
	public int getTotal_accepted_submissions() {
		return total_accepted_submissions;
	}
	public void setTotal_accepted_submissions(int total_accepted_submissions) {
		this.total_accepted_submissions = total_accepted_submissions;
	}
	
}

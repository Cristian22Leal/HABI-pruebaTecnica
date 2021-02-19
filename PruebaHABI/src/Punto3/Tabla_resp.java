package Punto3;

public class Tabla_resp {
	private int contest_id;
	private int hacker_id;
	private String name;
	private int total_submissions;
	private int total_accepted_submissions;
	private int total_views;
	private int total_unique_views;
	public Tabla_resp() {
		super();
	}
	public Tabla_resp(int contest_id, int hacker_id, String name, int total_submissions, int total_accepted_submissions,
			int total_views, int total_unique_views) {
		super();
		this.contest_id = contest_id;
		this.hacker_id = hacker_id;
		this.name = name;
		this.total_submissions = total_submissions;
		this.total_accepted_submissions = total_accepted_submissions;
		this.total_views = total_views;
		this.total_unique_views = total_unique_views;
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
	public int getTotal_views() {
		return total_views;
	}
	public void setTotal_views(int total_views) {
		this.total_views = total_views;
	}
	public int getTotal_unique_views() {
		return total_unique_views;
	}
	public void setTotal_unique_views(int total_unique_views) {
		this.total_unique_views = total_unique_views;
	}
	@Override
	public String toString() {
		return "Tabla_resp [contest_id=" + contest_id + ", hacker_id=" + hacker_id + ", name=" + name
				+ ", total_submissions=" + total_submissions + ", total_accepted_submissions="
				+ total_accepted_submissions + ", total_views=" + total_views + ", total_unique_views="
				+ total_unique_views + "]";
	}
	
}

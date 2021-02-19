package Punto3;

public class View_Starts_Table {
	private int challenge_id;
	private int total_views;
	private int total_unique_views;
	public View_Starts_Table() {
		super();
	}
	public View_Starts_Table(int challenge_id, int total_views, int total_unique_views) {
		super();
		this.challenge_id = challenge_id;
		this.total_views = total_views;
		this.total_unique_views = total_unique_views;
	}
	public int getChallenge_id() {
		return challenge_id;
	}
	public void setChallenge_id(int challenge_id) {
		this.challenge_id = challenge_id;
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
	
}

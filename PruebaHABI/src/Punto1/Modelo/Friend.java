package Punto1.Modelo;

public class Friend {
	private int ID;
	private int Friend_ID;
	public Friend() {
	}
	public Friend(int iD, int friend_ID) {
		ID = iD;
		Friend_ID = friend_ID;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getFriend_ID() {
		return Friend_ID;
	}
	public void setFriend_ID(int friend_ID) {
		Friend_ID = friend_ID;
	}
	@Override
	public String toString() {
		return "Friend [ID=" + ID + ", Friend_ID=" + Friend_ID + "]";
	}
	 
}

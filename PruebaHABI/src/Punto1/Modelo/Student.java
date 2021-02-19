package Punto1.Modelo;

public class Student {
	private int ID;
	private String name;
	
	public Student() {
	}

	public Student(int iD, String name) {
		ID = iD;
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + "]";
	}
	
	
}

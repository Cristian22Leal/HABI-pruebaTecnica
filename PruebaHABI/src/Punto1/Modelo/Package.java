package Punto1.Modelo;

public class Package {
	private int ID;
	private Double salary;
	public Package() {
		
	}
	public Package(int iD, double salary) {
		super();
		ID = iD;
		this.salary = salary;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Package [ID=" + ID + ", salary=" + salary + "]";
	}
	
}

package Punto1.Modelo;

import java.util.ArrayList;

public class Tablas {
	private ArrayList<Student> Students = new ArrayList();
	private ArrayList<Package> Packages = new ArrayList();
	private ArrayList<Friend> Friends = new ArrayList();
	
	public Tablas() {
	}
	
	public void AñadirFriends(ArrayList<Integer> ID, ArrayList<Integer> Friend_ID) {
		for (int i = 0; i < ID.size(); i++) {
			Friend nuevo = new Friend();
			nuevo.setID(ID.get(i));
			nuevo.setFriend_ID(Friend_ID.get(i));
			Friends.add(nuevo);
		}
	}
	
	public void AñadirStudent(ArrayList<Integer> ID, ArrayList<String> name) {
		for (int i = 0; i < ID.size(); i++) {
			Student nuevo = new Student();
			nuevo.setID(ID.get(i));
			nuevo.setName(name.get(i));
			Students.add(nuevo);
		}
	}
	public void AñadirPackages(ArrayList<Integer> ID, ArrayList<Double> salary) {
		for (int i = 0; i < ID.size(); i++) {
			Package nuevo = new Package();
			nuevo.setID(ID.get(i));
			nuevo.setSalary(salary.get(i));
			Packages.add(nuevo);
		}
	}
	
	public String ValidarSueldo(){
		int id = 0;
		String respuesta ="";
		String name = "";
		for (int i = 0; i < Friends.size(); i++) {
			id = Friends.get(i).getID();
			for (int j = 0; j < Students.size(); j++) {
				if (id==Students.get(j).getID()) {
					name = Students.get(j).getName();
				}
			}
			int Friend_ID = Friends.get(i).getFriend_ID();
			Double sueldo = 0.0;
			Double sueldoFriend = 0.0;
			for (int j = 0; j < Packages.size(); j++) {
				if(id == Packages.get(j).getID()) {
					sueldo = Packages.get(j).getSalary();
				}
				if(Friend_ID ==  Packages.get(j).getID()) {
					sueldoFriend = Packages.get(j).getSalary();
				}
			}
			if(sueldo<sueldoFriend && i<Friends.size()-1) {
				respuesta+=name+", ";
			}else if(sueldo<sueldoFriend && i==Friends.size()-1){
				respuesta+=name+".";
			}
		}
		return respuesta;
	}
	
	public ArrayList<Student> getStudents() {
		return Students;
	}
	public void setStudents(ArrayList<Student> students) {
		Students = students;
	}
	public ArrayList<Package> getPackages() {
		return Packages;
	}
	public void setPackages(ArrayList<Package> packages) {
		Packages = packages;
	}
	public ArrayList<Friend> getFriends() {
		return Friends;
	}
	public void setFriends(ArrayList<Friend> friends) {
		Friends = friends;
	}
	
}

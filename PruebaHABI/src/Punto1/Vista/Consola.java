package Punto1.Vista;

import java.util.ArrayList;
import java.util.Scanner;

import Punto1.Controlador.Controller;

public class Consola {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Controller controlador = new Controller();
		System.out.println("Con cuantas filas desea la tabla 'Friends'");
		int datos = leer.nextInt();
		System.out.println("ID Friend_ID");
		ArrayList<Integer> IDFriend = new ArrayList();
		ArrayList<Integer> Friend_ID = new ArrayList();
		for (int i = 0; i < datos; i++) {
			int id = leer.nextInt();
			int friend_ID = leer.nextInt();
			IDFriend.add(id); Friend_ID.add(friend_ID);			
		}
		controlador.inputFriends(IDFriend, Friend_ID);
		
		System.out.println("Con cuantas filas desea la tabla 'Students'");
		datos = leer.nextInt();
		System.out.println("ID Name");
		ArrayList<Integer> IDStudents = new ArrayList();
		ArrayList<String> name = new ArrayList();
		for (int i = 0; i < datos; i++) {
			int idStudents = leer.nextInt();
			String Name = leer.next();
			IDStudents.add(idStudents); name.add(Name);			
		}
		controlador.inputStudent(IDStudents, name);
		
		System.out.println("Con cuantas filas desea la tabla 'Package'");
		datos = leer.nextInt();
		System.out.println("ID salary");
		ArrayList<Integer> IDPackage = new ArrayList();
		ArrayList<Double> Salary = new ArrayList();
		for (int i = 0; i < datos; i++) {
			int idPackage = leer.nextInt();
			Double salary = leer.nextDouble();
			IDPackage.add(idPackage); Salary.add(salary);			
		}
		controlador.inputPackages(IDPackage, Salary);
		System.out.println(controlador.punto1());
				
	}
}

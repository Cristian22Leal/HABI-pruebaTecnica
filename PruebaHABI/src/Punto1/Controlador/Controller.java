package Punto1.Controlador;

import java.util.ArrayList;

import Punto1.Modelo.Tablas;

public class Controller {
	private Tablas tablas = new Tablas();
	
	public Controller() {
	
	}
	
	public void inputFriends(ArrayList<Integer> ID, ArrayList<Integer> Friend_ID) {
		tablas.AñadirFriends(ID, Friend_ID);		
	}
	public void inputStudent(ArrayList<Integer> ID, ArrayList<String> name) {
		tablas.AñadirStudent(ID, name);
	}
	public void inputPackages(ArrayList<Integer> ID, ArrayList<Double> salary) {
		tablas.AñadirPackages(ID, salary);
	}
	public String punto1() {
		String respuesta = tablas.ValidarSueldo();
		return respuesta;
	}
	

}

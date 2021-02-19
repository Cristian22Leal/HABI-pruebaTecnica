package Punto2.Controlador;

import Punto2.Modelo.ParesSimetricos;
import Punto2.Modelo.Tablas;

public class Controlador {
	Tablas tabla = new Tablas();

	public Controlador() {
	}
	
	public void añadirDatos(int x,int y) {
		ParesSimetricos pares = new ParesSimetricos(x,y);
		tabla.añadir(pares);
	}
	public void ordenar() {
		tabla.ordenar();
	}
	public String respuesta() {
		return tabla.respuesta();
	}
	
}

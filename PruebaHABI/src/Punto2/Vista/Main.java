package Punto2.Vista;

import java.util.Scanner;

import Punto2.Controlador.Controlador;
import Punto2.Modelo.ParesSimetricos;
import Punto2.Modelo.Tablas;

public class Main {
	public static void main(String[] args) {
		Controlador controlador = new Controlador();
		Scanner leer = new Scanner(System.in);
		System.out.println("digite cuantas filas quiere añadir");
		int datos = leer.nextInt();
		for (int i = 0; i < datos; i++) {
			int x = leer.nextInt();
			int y = leer.nextInt();
			controlador.añadirDatos(x, y);
		}
		controlador.ordenar();
		System.out.println(controlador.respuesta());
	}
}

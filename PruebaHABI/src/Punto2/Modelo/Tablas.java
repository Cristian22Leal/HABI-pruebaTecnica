package Punto2.Modelo;

import java.util.ArrayList;

public class Tablas {
	private ArrayList<ParesSimetricos> pares = new ArrayList();
	public void añadir(ParesSimetricos par) {
		pares.add(par);
	}
	public void ordenar() {
		ArrayList<ParesSimetricos> paresOrdenado = new ArrayList();
		for (int x = 0; x < pares.size(); x++) {
			int min =999999;
			int pos =0;
			for (int i = 0; i < pares.size(); i++) {
				if(min>pares.get(i).getX()) {
					min = pares.get(i).getX();
					pos = i;
				}
			}
			paresOrdenado.add(pares.get(pos));
			pares.remove(pos);
			x=-1;
		}
		pares=paresOrdenado;
	}
	public String respuesta() {
		String respuesta ="";
		for (int i = 0; i < pares.size()-1; i++) {
			int x1=pares.get(i).getX();
			int x2=pares.get(i+1).getX();
			int y1=pares.get(i).getY();
			int y2=pares.get(i+1).getY();
			if(x1==y2 && x2==y1) {
				if(x1<=y1) {
					respuesta+=x1+" "+y1+"\n";
				}
			}
		}
		return respuesta;
	}
	public ArrayList<ParesSimetricos> getPares() {
		return pares;
	}
	public void setPares(ArrayList<ParesSimetricos> pares) {
		this.pares = pares;
	}
	
}

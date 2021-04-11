package modelo;

import java.util.ArrayList;

public class Lienzo {
	
	ArrayList<Figura> figuras;
	
	public void choque() {
		for (int i = 0; i < figuras.size(); i++) {
			Figura a = figuras.get(i);
	        if(!(a instanceof Triangulo)) {
	        	for (int j = 0; j < figuras.size(); j++) {
	        		Figura b = figuras.get(i);
	        		if(!(b instanceof Triangulo)) {
	        			calcularInterseccion(a.getTam(), a.getPosX(), a.getPosY(), b.getTam(), b.getPosX(), b.getPosY());
	        		
	        		}
	    			
			    }
	        }
		    
		}
	}
	
	public void queFigura(Figura figura) {
		if (figura instanceof Circulo) {
			Circulo circle = (Circulo) figuras.get(i);
		}
		if (figura instanceof Cuadrado) {
			Cuadrado square = (Cuadrado) figuras.get(i);
		}
		if (figura instanceof Triangulo) {
			Triangulo triangle = (Triangulo) figuras.get(i);
		}
	}
	

	
	
	public boolean calcularInterseccion(int tam1, int x1, int y1, int tam2, int x2, int y2) {
		boolean resp = true;
		if (x1+tam1/2 >= x2+tam2/2 && x1+tam1/2 <= x2-tam2/2 && y1+tam1/2 >= y2+tam2/2 && y1+tam1/2 <= y2-tam2/2) {
			resp= true;
		}else {
			resp = false;
		}
		return resp;
	}
}

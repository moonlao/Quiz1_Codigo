package vista;
import java.util.ArrayList;
import java.util.Iterator;

import modelo.*;
import processing.core.PApplet;

public class VistaFiguras {
	
	private PApplet app;
	
	public VistaFiguras(PApplet app) {
		this.app = app;
	}
	public void pintarFiguras(ArrayList<Figura> a) {
		for (int i = 0; i < a.size(); i++) {
			if(a.get(i) instanceof Circulo) {
				Circulo c = (Circulo) a.get(i);
				app.fill(c.getR(),c.getG(), c.getB());
				app.ellipse(c.getPosX(), c.getPosY(), c.getTam(), c.getTam());
			}else if(a.get(i) instanceof Cuadrado) {
				Cuadrado c = (Cuadrado) a.get(i);
				app.fill(c.getR(),c.getG(), c.getB());
				app.ellipse(c.getPosX(), c.getPosY(), c.getTam(), c.getTam());
			}else if(a.get(i) instanceof Triangulo) {
				Triangulo c = (Triangulo) a.get(i);
				app.fill(c.getR(),c.getG(), c.getB());
				app.ellipse(c.getPosX(), c.getPosY(), c.getTam(), c.getTam());
			}
		}
		
	}
	
}

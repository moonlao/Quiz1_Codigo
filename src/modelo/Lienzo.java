package modelo;

import java.util.ArrayList;

public class Lienzo {

	ArrayList<Figura> figuras;
	
	public ArrayList<Figura> getFiguras() {
		return figuras;
	}


	public void setFiguras(ArrayList<Figura> figuras) {
		this.figuras = figuras;
	}


	public Lienzo () {
		figuras = new ArrayList<Figura>();
	}

	
	//Punto de fallo
	public void mover() {
		for (int i = 0; i < figuras.size(); i++) {
			figuras.get(i).mover();
		}
	}
	
	public void choque() {
		for (int i = 0; i < figuras.size(); i++) {
			Figura a = figuras.get(i);
		//	System.out.println((a instanceof Triangulo)+"");
			if (!(a instanceof Triangulo)) {
				for (int j = 0; j < figuras.size(); j++) {
					Figura b = figuras.get(j);
					//System.out.println((a instanceof Triangulo)+" Dos "+b.equals(a));
					if (!(b instanceof Triangulo) && (j!=i)) {
					//	System.out.println("Si entra");
						if (calcularInterseccion(a,b)) {
							try {
								Triangulo c = new Triangulo((int) (10 + (Math.random() * 80)), b.getPosX(), b.getPosY(), 0,
										a.getValor() + b.getValor(), b.getR(), b.getG(), b.getB());
								figuras.add(c);
								figuras.remove(j);
								figuras.remove(i);
							} catch (Exception exception){
								exception.printStackTrace();
							}
							
						}

					}

				}
			}

		}
	}

	public void addFiguras(Figura k) {
		figuras.add(k);
	}
	
	public void inicializar(ArrayList<Figura> a) {
		figuras = a;
		}
	

	public boolean calcularInterseccion(Figura a, Figura b) {
		boolean resp =false;
		int posXA = a.getPosX();
		int posYA = a.getPosY();
		int posXB = b.getPosX();
		int posYB = b.getPosY();
		int zB = b.getTam();
		int zA = a.getTam();
		
	    if(posXB >= posXA && posXB <= posXA+zA) {
	    	if(posYB >= posYA && posYB <= posYA+zA) {
	    		resp = true;
	    	}
	    }
		
		return resp;
	}
}

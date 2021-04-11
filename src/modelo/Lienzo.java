package modelo;

import java.util.ArrayList;

public class Lienzo {

	ArrayList<Figura> figuras;

	public void choque() {
		for (int i = 0; i < figuras.size(); i++) {
			Figura a = figuras.get(i);
			if (!(a instanceof Triangulo)) {
				for (int j = 0; j < figuras.size(); j++) {
					Figura b = figuras.get(i);
					if (!(b instanceof Triangulo) && (!b.equals(a))) {
						if (calcularInterseccion(a.getTam(), a.getPosX(), a.getPosY(), b.getTam(), b.getPosX(),
								b.getPosY())) {
							Triangulo c = new Triangulo((int) (10 + (Math.random() * 80)), b.getPosX(), b.getPosY(), 0,
									a.getValor() + b.getValor(), b.getR(), b.getG(), b.getB());
							figuras.remove(j);
							figuras.remove(i);
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
	

	public boolean calcularInterseccion(int tam1, int x1, int y1, int tam2, int x2, int y2) {
		boolean resp;
		if (x1 + tam1 / 2 >= x2 + tam2 / 2 && x1 + tam1 / 2 <= x2 - tam2 / 2 && y1 + tam1 / 2 >= y2 + tam2 / 2
				&& y1 + tam1 / 2 <= y2 - tam2 / 2) {
			resp = true;
		} else {
			resp = false;
		}
		return resp;
	}
}

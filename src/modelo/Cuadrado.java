package modelo;

public class Cuadrado extends Figura {

	public Cuadrado(int tam, int posX, int posY, int dir, int valor, int tipo, int r, int g, int b) {
		super(tam, posX, posY, dir, valor, tipo, r, g, b);
		this.r = 240;
		this.g = 159;
		this.b = 27;
	}

	@Override
	void mover() {
		if (this.dir == 1) {
			posY += 10;
			if (posY >= 800) {
				dir = -1;
			}
		}
		
		if (this.dir == -1) {
			posY -= 10;
			if (posY <= 0) {
				dir = 1;
			}
		}
	}		
	}

	
	
	

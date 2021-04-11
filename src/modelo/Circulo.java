package modelo;


public class Circulo extends Figura{

	
	
	

	public Circulo(int tam, int posX, int posY, int dir, int valor, int tipo, int r, int g, int b) {
		super(tam, posX, posY, dir, valor, tipo, r, g, b);
		super.r = 27;
		super.g = 240;
		super.b = 179;
	}

	@Override
	void mover() {
		if (this.dir == 1) {
			posX += 10;
			if (posX >= 800) {
				dir = -1;
			}
		}
		
		if (this.dir == -1) {
			posX -= 10;
			if (posX <= 0) {
				dir = 1;
			}
		}
	}
	
}

package modelo;


public class Circulo extends Figura{

	boolean isMoving;
	
	public boolean isMoving() {
		return isMoving;
	}

	public void setMoving(boolean isMoving) {
		this.isMoving = isMoving;
	}

	public Circulo(int tam, int posX, int posY, int dir, int valor, int r, int g, int b) {
		super(tam, posX, posY, dir, valor, r, g, b);
		super.r = 27;
		super.g = 240;
		super.b = 179;
		isMoving = true;
	}

	@Override
	void mover() {
		if (isMoving) {
			if (this.dir == 1) {
				posX += 1;
				if (posX >= 800 - tam) {
					dir = -1;
				}
			}
			
			if (this.dir == -1) {
				posX -= 1;
				if (posX <= 0) {
					dir = 1;
				}
			}
		}
		
	}
	
}

package modelo;

public class Cuadrado extends Figura {
	
	boolean isMoving;

	public Cuadrado(int tam, int posX, int posY, int dir, int valor, int r, int g, int b) {
		super(tam, posX, posY, dir, valor, r, g, b);
		this.r = 240;
		this.g = 159;
		this.b = 27;
		isMoving = true;
	}

	public boolean isMoving() {
		return isMoving;
	}

	public void setMoving(boolean isMoving) {
		this.isMoving = isMoving;
	}

	@Override
	void mover() {
		if(isMoving) {
			if (this.dir == 1) {
				posY += 1;
				if (posY >= 800 - tam) {
					dir = -1;
				}
			}
			
			if (this.dir == -1) {
				posY -= 1;
				if (posY <= 0) {
					dir = 1;
				}
			}
		}
	}		
}

	
	
	

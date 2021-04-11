package modelo;

public abstract class Figura {
	
	int tam, posX, posY, dir, valor;
	//static final int TIPO_1 = 1;
	//static final int TIPO_2 = 2;
	//static final int TIPO_3 = 3;
	
	int r, g, b;
	
	
	public Figura(int tam, int posX, int posY, int dir, int valor, 
			int r, int g, int b) {
		this.tam = tam;
		this.posX = posX;
		this.posY = posY;
		this.dir = dir;
		this.valor = valor;
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	
	public int getR() {
		return r;
	}


	public void setR(int r) {
		this.r = r;
	}


	public int getG() {
		return g;
	}


	public void setG(int g) {
		this.g = g;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	abstract void mover();
	

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getDir() {
		return dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	

	public boolean isQuieto() {
		return quieto;
	}

	public void setQuieto(boolean quieto) {
		this.quieto = quieto;
	}


	
	
	
	
	
	
	
	
	
	
	
	
}	

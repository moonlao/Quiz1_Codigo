package modelo;

public abstract class Figura {
	
	int tam, posX, posY, dir, valor, tipo;
	boolean quieto;
	static final int TIPO_1 = 1;
	static final int TIPO_2 = 2;
	static final int TIPO_3 = 3;
	
	int r, g, b;
	
	
	public Figura(int tam, int posX, int posY, int dir, int valor, int tipo, 
			int r, int g, int b) {
		this.tam = tam;
		this.posX = posX;
		this.posY = posY;
		this.dir = dir;
		this.valor = valor;
		this.tipo = tipo;
		this.r = r;
		this.g = g;
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

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public boolean isQuieto() {
		return quieto;
	}

	public void setQuieto(boolean quieto) {
		this.quieto = quieto;
	}

	public static int getTipo1() {
		return TIPO_1;
	}

	public static int getTipo2() {
		return TIPO_2;
	}

	public static int getTipo3() {
		return TIPO_3;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}	

package controlador;

import java.io.*;
import java.util.ArrayList;

import modelo.*;
import processing.core.PApplet;
import vista.VistaFiguras;

public class Control extends PApplet {

	Lienzo lienzo;
	VistaFiguras vista;
	ArrayList<Figura> inputText;

	public Control() {
		inputText = new ArrayList<Figura>();
		lienzo = new Lienzo();
		vista = new VistaFiguras(this);
	}

	public void cargar() {
		try {
			File file = new File("./texto/instrucciones.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			// System.out.println("Linea : "+line);
			while (line != null) {

				String[] linea = line.split(" ");
				if (linea[0].equals("Cuadrado")) {
					Cuadrado cuad = new Cuadrado(Integer.parseInt(linea[1]), Integer.parseInt(linea[2]),
							Integer.parseInt(linea[3]), Integer.parseInt(linea[4]), Integer.parseInt(linea[5]), 0, 0,
							0);
					inputText.add(cuad);
				} else {
					Circulo cir = new Circulo(Integer.parseInt(linea[1]), Integer.parseInt(linea[2]),
							Integer.parseInt(linea[3]), Integer.parseInt(linea[4]), Integer.parseInt(linea[5]), 0, 0,
							0);
					inputText.add(cir);
				}
				line = br.readLine();
			}
			fr.close();
			lienzo.inicializar(inputText);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		PApplet.main("controlador.Control");
	}

	public void settings() {
		size(800, 800);

	}

	public void setup() {
		cargar();
	}

	public void draw() {
		background(255);
		vista.pintarFiguras(lienzo.getFiguras());
		lienzo.mover();
		lienzo.choque();

	}

	public void mousePressed() {
		if (mouseButton == LEFT) {
			for (int i = 0; i < lienzo.getFiguras().size(); i++) {
				if (lienzo.getFiguras().get(i) instanceof Circulo) {
					Circulo circulo = (Circulo) lienzo.getFiguras().get(i);
					if (lienzo.calcularInterseccionPuntos(circulo, mouseX, mouseY)) {
						circulo.setMoving(!circulo.isMoving());
					}
				}
				if (lienzo.getFiguras().get(i) instanceof Cuadrado) {
					Cuadrado cuadrado = (Cuadrado) lienzo.getFiguras().get(i);
					if (lienzo.calcularInterseccionPuntos(cuadrado, mouseX, mouseY)) {
						cuadrado.setMoving(!cuadrado.isMoving());
					}
				}
			}

		}
		if (mouseButton == RIGHT) {
			int rand = (int) ((int) 1 + Math.random() * 2);
			if (rand == 1) {
				Circulo circle = new Circulo((int)((int)20 + Math.random() * 80), mouseX,  mouseY, -1,
						(int)((int)1 + Math.random() * 20), 0, 0, 0);
				circle.setR((int)((int)1 + Math.random() * 255));
				circle.setG((int) ((int)1 + Math.random() * 255));
				circle.setB((int) ((int)1 + Math.random() * 255));
				lienzo.addFiguras(circle);
			}if (rand == 2) {
				Cuadrado cuadrado = new Cuadrado((int)((int)20 + Math.random() * 80), mouseX,  mouseY, -1,
						(int)((int)1 + Math.random() * 20), 0, 0, 0);
				cuadrado.setR((int)((int)1 + Math.random() * 255));
				cuadrado.setG((int) ((int)1 + Math.random() * 255));
				cuadrado.setB((int) ((int)1 + Math.random() * 255));
				lienzo.addFiguras(cuadrado);
			}
		}
	}

}

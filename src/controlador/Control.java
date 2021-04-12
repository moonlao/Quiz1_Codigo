package controlador;

import java.io.*;
import java.util.ArrayList;

import modelo.*;

public class Control {
	
	Lienzo lienzo;
	
	ArrayList<Figura> inputText;

	public Control() {
		 inputText = new ArrayList<Figura>();
		 lienzo = new Lienzo();
	}
	
	public void cargar() {
		try {
           
			File file = new File("./texto/instrucciones.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
			      String[] linea = line.split(" ");
			      if(linea[0].equals("Cuadrado")) {
						Cuadrado cuad = new Cuadrado(Integer.parseInt(linea[1]), Integer.parseInt(linea[2]),
								Integer.parseInt(linea[3]), Integer.parseInt(linea[4]),
								Integer.parseInt(linea[5]), 0, 0, 0);
						inputText.add(cuad);
			      }else {
			    	  Circulo cir = new Circulo(Integer.parseInt(linea[1]), Integer.parseInt(linea[2]),
								Integer.parseInt(linea[3]), Integer.parseInt(linea[4]),
								Integer.parseInt(linea[5]), 0, 0, 0);
			    	  	inputText.add(cir);
			      }
			}
			fr.close();
			lienzo.inicializar(inputText);
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {

	}

	public void settings() {

	}
	
	public void iniciar() {
		-------c======3
	}

}

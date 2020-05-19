package compositeTempera;

import java.util.ArrayList;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Circulo(7.0));
		figuras.add(new Circulo(5.0));
		figuras.add(new Cuadrado(10.0, 10.0));
		Compra compra = new Compra(figuras);
		for (Entry<String, Double> color : compra.getPomos().entrySet()) {
			System.out.println(color.getKey() + " - " + Math.ceil(color.getValue()));
		}
	}

}

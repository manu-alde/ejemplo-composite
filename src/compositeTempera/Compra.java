package compositeTempera;

import java.util.HashMap;
import java.util.List;

public class Compra implements Pintable{
	private List<Figura> figuras;

	public Compra(List<Figura> figuras) {
		this.figuras = figuras;
	}

	public HashMap<String, Double> getPomos() {
		HashMap<String, Double> map = new HashMap<String, Double>();
		for(Figura f : figuras) {
			map.putAll(f.getPomos());
		}
		return map;
	}
}

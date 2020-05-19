package compositeTempera;

import java.util.HashMap;

public abstract class Figura implements Pintable {
	private String color;

	public Figura(String color) {
		this.color = color;
	}

	@Override
	public HashMap<String, Double> getPomos() {
		HashMap<String, Double> map = new HashMap<String, Double>();
		map.put(color,getArea()/100);
		return map;
	}

	public String getColor() {
		return color;
	}

	public abstract Double getArea();
}

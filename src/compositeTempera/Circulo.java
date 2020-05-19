package compositeTempera;

public class Circulo extends Figura {
	private Double radio;

	public Circulo(Double radio) {
		super("rojo");
		this.radio = radio;
	}

	public Double getRadio() {
		return radio;
	}

	@Override
	public Double getArea() {
		return Math.pow(Math.PI * radio, 2);
	}

}

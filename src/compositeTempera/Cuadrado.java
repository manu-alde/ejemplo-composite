package compositeTempera;

public class Cuadrado extends Figura {
	private Double base;
	private Double altura;

	public Cuadrado(Double base, Double altura) {
		super("amarillo");
		this.base = base;
		this.altura = altura;
	}

	public Double getBase() {
		return base;
	}

	public Double getAltura() {
		return altura;
	}

	@Override
	public Double getArea() {
		return base * altura;
	}

}

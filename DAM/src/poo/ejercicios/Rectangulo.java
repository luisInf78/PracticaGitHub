package poo.ejercicios;

public class Rectangulo {
	// atributos
	private double base;
	private double altura;

	// constructor
	public Rectangulo(double base, double altura) {

		// Esto es lo mismo que un if pero con la terna
		this.base = (base > 0 ? base : 1);

		// Esto es lo mismo que un if pero con la terna
		this.altura = (altura > 0 ? altura : 1);
	}

	// métodos para consultar
	public double getBase() {
		return this.base;
	}

	public double getAltura() {
		return this.altura;
	}

	// métodos para calcular
	public double area() {
		return this.base * this.altura;
	}

	public double perimetro() {
		return 2 * this.base + 2 * this.altura;
	}

	// métodos para modificar cada medida
	public void setBase(double base) {
		if (base > 0)
			this.base = base;
	}

	public void setAltura(double altura) {
		if (altura > 0)
			this.altura = altura;
	}

}//fin class

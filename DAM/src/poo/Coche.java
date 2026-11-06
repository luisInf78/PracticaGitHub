package poo;

public class Coche {
	
	private String color;
	private int velocidad;
	private float tamano;
	private Motor motor;
	private Rueda [] ruedas;
	private boolean arrancado;
	
	public Coche(String color, int velocidad, float tamanyo, Motor motor, Rueda [] rueda) {
		this.color = color;
		this.velocidad = velocidad;
		this.tamano = tamanyo;
		this.motor = motor;
		this.ruedas = rueda;
	}
	
	//metodo get
	public String getColor() {
		return this.color;
	}
	
	public int getVelocidad() {
		return this.velocidad;
	}
	
	public float getTamano() {
		return this.tamano;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	public void setTamano(float tamano) {
		this.tamano = tamano;
	}
	
	public void avanzar() {
		if(arrancado)
			this.velocidad += 10;
	}
	
	public void frenar() {
		if(arrancado)
			this.velocidad -= 5;
	}
	
	public void arrancar() {
		this.arrancado = true;
	}
	
	public void parar() {
		this.arrancado = false;
	}
	
	public Motor getMotor() {
		return this.motor;
	}

	public Rueda[] getRuedas() {
		return ruedas;
	}
	
	
	
}

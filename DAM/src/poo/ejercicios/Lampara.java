package poo.ejercicios;

public class Lampara {
	
	private String marca;
	private boolean encendida;
	
	public Lampara(String marca) {
		this.marca = marca;
	}
	
	public void encender() {
		this.encendida = true;
	}
	
	public void apagar() {
		this.encendida = false;
	}
	
	public boolean estaEncencida() {
		return this.encendida;
	}

}

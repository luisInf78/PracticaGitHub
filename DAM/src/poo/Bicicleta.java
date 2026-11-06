package poo;

public class Bicicleta {
	
	private int velocidad;
	private int plato;
	private int pinon;
	
	public Bicicleta(int velocidad, int plato, int pinon) {
		
		this.velocidad = velocidad;
		this.plato = plato;
		this.pinon = pinon;
		
	}
	
	public void acelerar() {
		if(!(this.pinon == 11 && this.plato == 2 && this.velocidad >=30)) {
			
			if( (this.velocidad *2) >= 30)
				this.velocidad = 30;
			else
				this.velocidad *=2;
		}
		
	}
	
	public void frenar() {
		this.velocidad /=2;
	}
	
	public void cambiarPlato(int plato) {
		this.plato = plato;
	}
	
	public void cambiarPinon(int pinon) {
		this.pinon = pinon;
	}
	
	public int getVelocidad() {
		return this.velocidad;
	}
	
	public int getPlato() {
		return this.plato;
	}
	
	public int getPinon() {
		return this.pinon;
	}

}

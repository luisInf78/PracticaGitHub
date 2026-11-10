package poo.ejercicios;

public class CuentaBancaria {
	
	private String titular;
	private double saldo;
	
	public CuentaBancaria(String titular) {
		this.titular = titular;
		this.saldo = 0;
	}
	
	public boolean ingresar(double cantidad) {
		if (cantidad > 0) {
			this.saldo += cantidad;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean retirar(double cantidad) {
		if( cantidad > 0 && this.saldo >= cantidad) {
			this.saldo -= cantidad;
			return true;
		}else {
			return false;
		}
				
	}
	
	public String getTitutlar() {
		return this.titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	

}

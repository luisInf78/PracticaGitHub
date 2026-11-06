package poo;

public class MainBicicleta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bicicleta b1 = new Bicicleta(5,2,5);
		b1.cambiarPlato(2);
		b1.cambiarPinon(11);
		b1.acelerar();
		b1.acelerar();
		b1.acelerar();
		b1.acelerar();
		
		System.out.println(b1.getVelocidad());
		

	}

}

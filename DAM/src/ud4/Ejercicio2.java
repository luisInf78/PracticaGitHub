package ud4;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] nombres = {"Ana", "Luis", "Marta", "Pablo", "Sara"};
		
		for(int i = 0; i < nombres.length; i++)
			System.out.println(nombres[i] +" - " + i);
		
		System.out.println("**********************");
		System.out.println("Orden inverso");
		System.out.println("**********************");
		
		for(int i = nombres.length-1; i >= 0; i--)
			System.out.println(nombres[i] +" - " + i);
	}

}

package cadenas;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena;
		int contadorA = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Escribe una cadena: ");
		cadena = leer.nextLine();
		
		if(!cadena.isEmpty()) {
			
			for(int i = 0; i < cadena.length(); i++) {
				
				System.out.println(cadena.charAt(i) + " - " + i );
				if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A')
					contadorA++;
			}
				
			System.out.println("La A y la a aparecen: " + contadorA + " veces");
		}else {
			System.out.println("La cadena es vacía");
		}

	}

}

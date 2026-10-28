package cadenas;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena;
		Scanner leer = new Scanner(System.in);
		System.out.println("Escribe una cadena: ");
		cadena = leer.nextLine();
		
		if(!cadena.isEmpty()) {
			System.out.println("La longitud es: "+cadena.length());
			System.out.println("El primer caracter es: "+cadena.charAt(0));
			System.out.println("El último caracter es: "+cadena.charAt(cadena.length()-1));
			
		}else {
			System.out.println("La cadena es vacía");
		}
		
		
		leer.close();
		
		

	}

}

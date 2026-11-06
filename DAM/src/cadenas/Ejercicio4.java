package cadenas;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		char caracter;
		int contador = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("Escribe una cadena: ");
		cadena = leer.nextLine();
		System.out.println("Escribe un caracter a buscar: ");
		caracter = leer.nextLine().charAt(0);
		
		System.out.println("Posición primera aparición: "+
				(cadena.indexOf(caracter)!=-1 ? cadena.indexOf(caracter):"El caracter no está" ));
		System.out.println("Posición ultima aparición: "+
				(cadena.lastIndexOf(caracter)!=-1 ? cadena.lastIndexOf(caracter):"El caracter no está" ));
		if(cadena.indexOf(caracter)!=-1)
			System.out.println(cadena.indexOf(caracter)-cadena.lastIndexOf(caracter) != 0 ? "aparece varias veces":"solo aparece una vez");
	}

}

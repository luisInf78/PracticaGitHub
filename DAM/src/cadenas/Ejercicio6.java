package cadenas;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena;
		Scanner leer = new Scanner(System.in);
		System.out.println("Escribe una cadena: ");
		cadena = leer.nextLine().toLowerCase();
		
		//comprobamos que comienza por Práctica
		if(cadena.startsWith("Practica".toLowerCase()) && cadena.endsWith(".java".toLowerCase()))
			System.out.println("El nombre es correcto");
		else if(!cadena.startsWith("Practica".toLowerCase()) & !cadena.endsWith(".java".toLowerCase()))
				System.out.println("No comienza por Practica " );
			
			
			if (!cadena.endsWith(".java".toLowerCase()))
				System.out.println("no termina en .java");
			else
				
			System.out.println("No comienza por Practica");
		
		
	}

}

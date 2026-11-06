package cadenas;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena1, cadena2;

		Scanner leer = new Scanner(System.in);
		System.out.println("Escribe una cadena1: ");
		cadena1 = leer.nextLine();
		System.out.println("Escribe una cadena: ");
		cadena2 = leer.nextLine();
		
		if (cadena1.equals(cadena2))
			System.out.println("Iguales teniendo en cuentad mayúsculas y minúsculas");
		else
			System.out.println("Son diferentes teniendo en cuenta mayúsculas y minúsculas");

		if (cadena1.compareToIgnoreCase(cadena2) == 0)
			System.out.println("las cadenas son iguales sin tener encuanta mayus y minus");
		else
			System.out.println("las cadenas son dintintas");

		if (cadena1.compareToIgnoreCase(cadena2) > 0)
			System.out.println("la cadena2 aparece antes que la cadena1");
		else if (cadena1.compareToIgnoreCase(cadena2) < 0)
			System.out.println("la cadena1 aparece antes que la cadena2");

	}

}

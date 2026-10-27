package ud4;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] valores = {7, 12, 4, 9, 6};
		int suma = 0, contSuperior = 0;
		double media = 0;
		
		for(int i = 0; i < valores.length; i++)
			suma += valores[i];
		
		media = (double)suma/valores.length;
		
		for(int i = 0; i < valores.length; i++)
			if(valores[i] > media)
				contSuperior++;
		
		System.out.println("La suma es: " + suma);
		System.out.println("La media es: " + media);
		System.out.println(contSuperior + " son los valores que superan la media");

	}

}

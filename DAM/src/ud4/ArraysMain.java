package ud4;

public class ArraysMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] dArrTemperatura = new double [4];
		String [] sArrAula = {"aula20","aula21","aula22", "aula23"} ;
		double suma = 0;
		double media = 0;
		
		dArrTemperatura[0] = 34.5;
		dArrTemperatura[1] = 45.2;
		dArrTemperatura[2] = 67.5;
		dArrTemperatura[3] = 89.9;
		
		//recorrer un array con for
		
		for(int i = 0;i < dArrTemperatura.length; i++) {
			suma += dArrTemperatura[i];
			media = suma / dArrTemperatura.length;
			
		}//fin for
		//mostramos por consola
		System.out.println("La suma es: " + suma);
		System.out.println("La media es: " + media);
		
		for(int i = 0; i < sArrAula.length; i++)
			System.out.println("El aula "+sArrAula[i]+" - "+dArrTemperatura[i]);
		
		}

}

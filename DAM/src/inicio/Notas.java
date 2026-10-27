package inicio;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota = 4;
		
		
		if(nota >= 0 && nota < 5)
			System.out.println("Suspenso");
		else if(nota >= 5 && nota < 7)
			System.out.println("aprobado");
		else if(nota >= 7 && nota < 9)
			System.out.println("notable");
		else if(nota >= 9 && nota < 10)
			System.out.println("Sobresaliente");
		else if(nota == 10)
			System.out.println("MH");
		else
			System.out.println("La nota es incorrecta");

	}

}

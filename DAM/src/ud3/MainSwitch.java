package ud3;

public class MainSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota = 11;
		String strNota = "suspenso";
		char chrNota = 65;
		System.out.println("la letra es " + chrNota);
		
		switch (nota) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("Estas suspenso");
				break;
			case 5:
			case 6:
				System.out.println("Aprobado");
				break;
			case 7:
			case 8:
				System.out.println("Notable");
				break;
			case 9:
				System.out.println("Sobresaliente");
				break;
			case 10:
				System.out.println("Matricula");
				break;
			default:
				System.out.println("la nota introducida no es correcta");
			
		}
		
		
		
		switch (strNota) {
		case "suspenso": 
			System.out.println("Tu nota es entre 0 - 4.99");
			break;
		case "aprobado":
			System.out.println("Tu nota es entre 5 - 6.99");
			break;
		case "notable":
			System.out.println("Tu nota es entre 7 - 8.99");
			break;	
			
		case "sobresaliente":
			System.out.println("Tu nota es entre 9 - 9.99");
			break;	
			
		case "Matricula":
			System.out.println("Tu nota es 10");
			break;
		default:
			System.out.println("la nota introducida no es correcta");
		}
		
		
		switch (chrNota) {
		case 'F':
		case 'f':
			System.out.println("Tienes menos de un 6");
			break;
		case 'D':
		case 'd':
			System.out.println("Tienes entre 6 - 6.99");
			break;
		case 'C':
		case 'c':
			System.out.println("Tienes entre 7 - 7.99");
			break;
		case 'B':
		case 'b':
			System.out.println("Tienes entre 8 - 8.99");
			break;
		case 'A':
		case 'a':
			System.out.println("Tienes entre 9 - 10");
			break;
		default:
			System.out.println("la nota introducida no es correcta");
		
	}
	}

}

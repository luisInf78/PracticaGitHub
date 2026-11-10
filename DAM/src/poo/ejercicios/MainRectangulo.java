package poo.ejercicios;

public class MainRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangulo r1 = new Rectangulo(12, 5);
		
		System.out.println("El área es: " + r1.area());
		System.out.println("El perímetro es: " + r1.perimetro());
		
		System.out.println("La base es: " + r1.getBase());
		System.out.println("La altura es: " + r1.getAltura());
		
		//modifico los atributos
		System.out.println("*********** modifico atributos **********");
		
		r1.setAltura(10);
		r1.setBase(20);
		
		System.out.println("El área es: " + r1.area());
		System.out.println("El perímetro es: " + r1.perimetro());
		
		System.out.println("La base es: " + r1.getBase());
		System.out.println("La altura es: " + r1.getAltura());
		
		

	}

}

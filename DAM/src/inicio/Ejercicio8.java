package inicio;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declarción de variables
		int a=1, b=2, c=3, d=1;
		float r , s=(float)3.0;
		
		//operaciones
		r = a+b/c+d/a;
		System.out.println("r: " + r);
		s=r-s;
		r=(long)s;
		r=++r;
		System.out.println(r);

	}

}

package poo;

public class MainCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Motor m1 = new Motor(102,1000,"gasolina");
		
		Rueda dd = new Rueda(18,"Michelin");
		Rueda di = new Rueda(18,"Michelin");
		Rueda td = new Rueda(18,"Michelin");
		Rueda ti = new Rueda(18,"Michelin");
		
		
		
		Rueda [] ruedasc1= {dd,di,td,ti};
		
		
		
		
		Coche c1 = new Coche("rojo",0,1.76f,m1, ruedasc1);
		Coche c2 = new Coche("amarillo",100,1.8f,m1,ruedasc1);
		Coche c3 = new Coche("rojo",0,1.76f,m1,ruedasc1);
		
		
		c1.getColor();
		
				
		c1.getMotor().getCombustible();
		
		Rueda [] ruedascoche1 = c1.getRuedas();
		Rueda r0 = ruedascoche1[0];
		r0.getDiametro();
		
		Rueda r1 = ruedascoche1[1];
		r1.getDiametro();
		
		System.out.println(c1.getRuedas()[0].getDiametro());
		
		
		
		
		/*
		System.out.println(c1.getColor());
		System.out.println(c1.getVelocidad());
		c1.arrancar();
		c1.avanzar();
		c1.avanzar();		
		System.out.println(c1.getVelocidad());
		c1.parar();
		System.out.println(c1.getVelocidad());
		
		System.out.println(c1.getMotor().getCc());
		System.out.println(c2.getMotor().getCc());
		*/
	}

}

package poo.ejercicios;

public class MainLampara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lampara l1 = new Lampara("Osram");
		l1.encender();
		
		System.out.println();
		System.out.println(l1.estaEncencida()?"Esta encendida":"Está apagada") ;

		
	}

}

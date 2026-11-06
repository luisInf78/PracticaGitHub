package poo;

public class Motor {
	
	private int cv;
	private int cc;
	private String combustible;
	
	
	public Motor(int cv, int cc, String combustible) {
		this.cv = cv;
		this.cc = cc;
		this.combustible = combustible;
	}


	public int getCv() {
		return cv;
	}


	public int getCc() {
		return cc;
	}


	public String getCombustible() {
		return combustible;
	}
	
	
	

}

package modelos;

import java.util.Objects;

public class Urgencia {
	
	private static int idUrgencia;
	private String urgencia;
	private int nivelUrgencia;
	public Urgencia(String urgencia, int nivelUrgencia) {
		super();
		this.urgencia = urgencia;
		this.nivelUrgencia = nivelUrgencia;
		idUrgencia++;
	}
	public String getUrgencia() {
		return urgencia;
	}
	public void setUrgencia(String urgencia) {
		this.urgencia = urgencia;
	}
	public int getNivelUrgencia() {
		return nivelUrgencia;
	}
	public void setNivelUrgencia(int nivelUrgencia) {
		this.nivelUrgencia = nivelUrgencia;
	}
	public static int getIdUrgencia() {
		return idUrgencia;
	}
	@Override
	public String toString() {
		return "Urgencia [urgencia=" + urgencia + ", nivelUrgencia=" + nivelUrgencia + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nivelUrgencia, urgencia);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Urgencia other = (Urgencia) obj;
		return nivelUrgencia == other.nivelUrgencia && Objects.equals(urgencia, other.urgencia);
	}
	
	
	
	

}

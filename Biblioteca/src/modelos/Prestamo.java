package modelos;

import java.util.Objects;

public class Prestamo {
	
	private static int idPrestamo;
	private int idLibro;
	private int idUsuario;
	private int idUrgencia;
	public Prestamo(int idLibro, int idUsuario, int idUrgencia) {
		super();
		this.idLibro = idLibro;
		this.idUsuario = idUsuario;
		this.idUrgencia = idUrgencia;
		idPrestamo++;
	}
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getIdUrgencia() {
		return idUrgencia;
	}
	public void setIdUrgencia(int idUrgencia) {
		this.idUrgencia = idUrgencia;
	}
	public static int getIdPrestamo() {
		return idPrestamo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idLibro, idUrgencia, idUsuario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prestamo other = (Prestamo) obj;
		return idLibro == other.idLibro && idUrgencia == other.idUrgencia && idUsuario == other.idUsuario;
	}
	@Override
	public String toString() {
		return "Prestamo [idLibro=" + idLibro + ", idUsuario=" + idUsuario + ", idUrgencia=" + idUrgencia + "]";
	}
	
	
	
	

}

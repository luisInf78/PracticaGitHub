package modelos;

import java.util.Objects;

public class Autor {
	
	private static int idAutor;
	private String nombre;
	public Autor(String nombre) {
		super();
		this.nombre = nombre;
		idAutor++;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static int getIdAutor() {
		return idAutor;
	}
	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
	
	
	
	

}

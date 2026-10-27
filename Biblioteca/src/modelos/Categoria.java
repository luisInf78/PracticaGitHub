package modelos;

import java.util.Objects;

public class Categoria {
	
	private static int idCategoria;
	private String categoria;
	public Categoria(String categoria) {
		super();
		this.categoria = categoria;
		idCategoria++;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public static int getIdCategoria() {
		return idCategoria;
	}
	@Override
	public String toString() {
		return "Categoria [categoria=" + categoria + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(categoria);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(categoria, other.categoria);
	}
	
	
	
	

}

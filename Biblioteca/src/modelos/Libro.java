package modelos;

public class Libro {
	
	private static int idLibro;
	private String titulo;
	private int idAutor;
	private int idCategoria;
	private boolean disponibilidad;
	
	public Libro(String titulo, int idAutor, int idCategoria) {
		super();
		idLibro++;
		this.titulo = titulo;
		this.idAutor = idAutor;
		this.idCategoria = idCategoria;
		this.disponibilidad = true;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getIdAutor() {
		return idAutor;
	}
	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public static int getIdLibro() {
		return idLibro;
	}
	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	
	
	
	
	
	
	
	

}

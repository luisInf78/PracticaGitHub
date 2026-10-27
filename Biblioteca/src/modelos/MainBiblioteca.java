package modelos;

public class MainBiblioteca {

	public static void main(String[] args) {

			Biblioteca b = new Biblioteca();
			
			Categoria c1 = new Categoria("Terror");
			Autor a1 = new Autor("Stephen King");
			Libro l1 = new Libro("IT", a1.getIdAutor(), c1.getIdCategoria());
			
			b.addAutor(a1);
			b.addCategoria(c1);
			b.addLibro(l1);
			
			
			
			
	}
}

package modelos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Biblioteca {
	
	ArrayList<Libro> arrLibros;
	HashSet<Autor> hsAutor;
	TreeSet<Categoria> tsCategoria;
	PriorityQueue<Prestamo> pqPrestamo;
	LinkedList<Prestamo> lkHistorial;
	
	public Biblioteca() {
		super();
		arrLibros = new ArrayList<Libro>();
		hsAutor = new HashSet<Autor>();
		tsCategoria = new TreeSet<Categoria>();
		pqPrestamo = new PriorityQueue<Prestamo>();
		lkHistorial = new LinkedList<Prestamo>();
	}
	
	public boolean addLibro(Libro l) {
		
		return arrLibros.add(l);
	}
	
	public boolean addAutor(Autor a) {
		
		return hsAutor.add(a);
	
	}
	
	public boolean addCategoria(Categoria c) {
		return tsCategoria.add(c);
	}
	
	public boolean registrarPrestamo(Libro l, Usuario u, Urgencia ur) {
		if(l.isDisponibilidad()) {
			Prestamo p = new Prestamo(l.getIdLibro(), u.getIdUsuario(), ur.getIdUrgencia());
			pqPrestamo.add(p);
			l.setDisponibilidad(false);
			//lkHistorial.add(p);
			return true;
		}
		
		return false;
	}
	
	public boolean procesarPrestamo(Prestamo p) {
		Libro l = buscarLibro(p.getIdLibro());
		if(l!= null) {
			l.setDisponibilidad(true);
			pqPrestamo.remove(p);
			lkHistorial.add(p);
			return true;
		}else {
			return false;
		}
		
		
		
	}
	
	private Libro buscarLibro(int idLibro) {
		
		for(Libro l: arrLibros)
			if(l.getIdLibro() == idLibro)
				return l;
		
		return null;
	}
	
	
	
	
	
	
	
	
	

}

package modelos;

import java.util.Objects;

public class Usuario {
	
	private static int idUsuario;
	private String nomUsuario;
	
	public Usuario(String nomUsuario) {
		super();
		this.nomUsuario = nomUsuario;
		idUsuario++;
		
	}

	public String getNomUsuario() {
		return nomUsuario;
	}

	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}

	public static int getIdUsuario() {
		return idUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [nomUsuario=" + nomUsuario + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomUsuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nomUsuario, other.nomUsuario);
	}
	
	

}

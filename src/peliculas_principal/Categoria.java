package peliculas_principal;

import java.util.Objects;

public class Categoria {
	
	private int id;
	private String Descripcion;
	
	Categoria(){}
	Categoria(int id,String Descripcion)
	{
		this.id = id;
		this.Descripcion = Descripcion;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Descripcion, id);
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
		return Objects.equals(Descripcion, other.Descripcion) && id == other.id;
	}
	@Override
	public String toString() {
		return Descripcion;
	}
	
	
	
	
	

}

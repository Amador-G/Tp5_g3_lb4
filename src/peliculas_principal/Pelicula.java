package peliculas_principal;

import java.util.Objects;

public class Pelicula implements Comparable<Pelicula> {
	
	private static int id_inicial = 0;
	private int id;
	private String Nombre;
	private Categoria Categoria;
	
	
	 public Pelicula(String Nombre,Categoria cat )
	{
		this.id = ID_autonumerico();
		this.Nombre = Nombre;
		Categoria=new Categoria();
		this.Categoria.setId(cat.getId());
		this.Categoria.setDescripcion(cat.getDescripcion());
	}
	
	
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Categoria getCategoria() {
		return Categoria;
	}
	public void setCategoria(Categoria categoria) {
		Categoria = categoria;
	}
	public int getId() {
		return id;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(Categoria, Nombre, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		return Objects.equals(Categoria, other.Categoria) && Objects.equals(Nombre, other.Nombre) && id == other.id;
	}
	
	
	
	public static int ID_autonumerico() {
		id_inicial ++;
		return id_inicial;
	}
	
	@Override
	public int compareTo(Pelicula o) {
int salida;
		
		if(o.getNombre().compareToIgnoreCase(this.getNombre()) > 0)
		{
		salida = -1;
		}
		else 
		{
			if(o.getNombre().compareToIgnoreCase(this.getNombre()) < 0)
			{
				salida = 1;
			}
			else
			{
				salida = 0;
				}
		}
		return salida;					
	}
	@Override
	public String toString() {
		return "Pelicula\nid = " + id + "\nNombre = " + Nombre + "\nCategoria = " + Categoria.getDescripcion();
	}
	
	
	
}
	



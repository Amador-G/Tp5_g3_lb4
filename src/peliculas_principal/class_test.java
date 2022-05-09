package peliculas_principal;

public class class_test {

	public static void main(String[] args) {
		Categoria cat = new Categoria(1,"terror");
		Pelicula Peli1 = new Pelicula("Freddy",cat);
		Pelicula Peli2 = new Pelicula("Jason",cat);
		Pelicula Peli3 = new Pelicula("Jasonesss",cat);
		
		
		
		System.out.println(Peli1.toString());
		System.out.println(Peli2.toString());
		System.out.println(Peli3.toString());

	}

}

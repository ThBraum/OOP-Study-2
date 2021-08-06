package POO;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Livro l1 = new Livro("Dom Casmurro", 30.0, 100, "Machado de Assis", "Literatura romantica", 250);
		Livro l2 = new Livro("Memórias Póstumas de Brás Cubas", 20.0, 130, "Machado de Assis", "Literatura romantica", 200);
		
		VideoGame ps4 = new VideoGame("PS4", 1700.0, 100, "Sony", "Slim", true);
		VideoGame ps5 = new VideoGame("Ps5", 6000.0, 20, "Sony", "Midia digital", false);
		
		List<Livro> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		
		List<VideoGame> games = new ArrayList<>();
		games.add(ps4);
		games.add(ps5);
		
		Loja kabum = new Loja("kabum", livros, games);
		
		kabum.listaLivros();
		kabum.listaVideoGames();
		
		System.out.println("\n\n");
		
		System.out.println(kabum.calculaPatrimonio());
		
	}

}

package POO;

import java.util.List;

public class Loja{
	public String nome;
	public List<Livro>livros;
	public List<VideoGame>videoGames;
	
	public Loja() {
		
	}
	
	public Loja(String nome, List<Livro>livros, List<VideoGame>videoGames) {
		super();
		this.nome = nome;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
	
	public void listaLivros() {
		if (livros.isEmpty()) {
			System.out.println("A loja não tem livros no seu estoque");
		}else {
			for (int i = 0; i < livros.size(); i++) {
				System.out.println(livros.get(i).getNome() 
				+ ", " +  livros.get(i).getPreco() 
				+ ", " + livros.get(i).getQtd()
				+ ", " + livros.get(i).getAutor() 
				+ ", " + livros.get(i).getTema() 
				+ ", " + livros.get(i).getQtdPag());
			}
		}
	}
	
	public void listaVideoGames() {
		if (videoGames.isEmpty()) {
			System.out.println("A loja não tem videogames no seu\r\n"
					+ "estoque");
		}else {
			for (int i = 0; i < videoGames.size(); i++) {
				System.out.println(videoGames.get(i).getNome() 
				+ ", " +  videoGames.get(i).getPreco() 
				+ ", " + videoGames.get(i).getQtd() 
				+ ", " + videoGames.get(i).getMarca() 
				+ ", " + videoGames.get(i).getModelo() 
				+ ", " + videoGames.get(i).isUsado());
			}
		}
	}
	
	public double calculaPatrimonio(){
		double patrimonio = 0;
		
		for (int i = 0; i < livros.size(); i++) {
			patrimonio = patrimonio + livros.get(i).getPreco() * livros.get(i).getQtd(); 
		}
		
		for (int i = 0; i < videoGames.size(); i++) {
			patrimonio = patrimonio + videoGames.get(i).getPreco() * videoGames.get(i).getQtd(); 
		}
		
		return patrimonio;
	}
	
	
}

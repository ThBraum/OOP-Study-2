package POO;

public class Livro extends Produto implements Imposto{

	public String autor;
	public String tema;
	public int qtdPag;

	

	
	public Livro() {
		super();
		
	}




	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}




	public String getAutor() {
		return autor;
	}




	public void setAutor(String autor) {
		this.autor = autor;
	}




	public String getTema() {
		return tema;
	}




	public void setTema(String tema) {
		this.tema = tema;
	}




	public int getQtdPag() {
		return qtdPag;
	}




	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}




	@Override
	public double impostoSobreProd() {
		double imposto = 0;
		
		if (this.tema == "Literatura romantica") {
			
		}else {
			imposto = this.preco * 0.1;
		}
		return imposto;
	}
	
}

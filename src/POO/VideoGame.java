package POO;

public class VideoGame extends Produto implements Imposto{
	public String marca;
	public String modelo;
	public boolean isUsado;
	
	public VideoGame() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public boolean isUsado() {
		return isUsado;
	}
	
	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public double impostoSobreProd() {
		double imposto = 0;
		
		if (this.isUsado == true) {
			imposto = this.preco * 0.40;
		}else {
			imposto = this.preco * 0.20;
		}
		return imposto;
	}
	
	
	
	
	
}

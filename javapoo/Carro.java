package javapoo;

public class Carro {
	 String cor;
	 double preco;
	 String modelo;
	
	/*construtor com nenhum*/
	public Carro() {
		
	}
	/*construtor em 2 param*/
	
	public Carro(String modelo,  double preco) {
		this.cor ="PRETA";
		this.modelo = modelo;
		this.preco = preco;
	}
	/*construtor em 3 param*/
	
	public Carro(String cor, String modelo, double preco) {
		this.cor = cor;
		this.modelo = modelo;
		this.preco = preco;
	}
}

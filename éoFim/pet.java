package éoFim;

public class pet {
	private String nome;
	private String tipo;
	private int idade;
	
public pet(String nome, String tipo, int idade) {
	this.nome = nome;
	this.tipo = tipo;
	this.idade = idade;
}

public pet (String nome) {
	this.nome = nome;
	
}
public pet() {
	
}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
	
	

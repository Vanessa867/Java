package polimorfismo;

public class animais {
	public String cor;
	public String especie;
	public String habitat;
	public String som;
	
	
public animais (String cor, String especie, String habitat, String som) {
	this.cor = cor;
	this.especie = especie;
	this.habitat = habitat;
	this.som = som;
}
public String emitirSom() {
	return "Tá fazendo barulho!";
}	
}
	
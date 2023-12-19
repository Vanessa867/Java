package polimorfismo;

public class gato extends mamiferos{

	public gato(String cor, String especie, String habitat, String som) {
		super(cor, especie, habitat, som);
		
		
	}
	public String  emitirSom() {
		return "beeeee";
	}

}

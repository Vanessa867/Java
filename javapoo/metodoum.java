package javapoo;

public class metodoum {
public static void main(String[] args) {
	
	int idade;
	double valor;
	String nome;
	boolean estado;
	
	javaMetodos teste = new javaMetodos();
	
	idade = teste.idade();
	valor = teste.valor();
	nome = teste.nome();
	estado = teste.estado();
	
	System.out.printf("A idade do aluno %s é %d", nome , idade);
}
	
}

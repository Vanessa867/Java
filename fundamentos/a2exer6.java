package fundamentos;
import java.util.Scanner;
public class a2exer6 {
public static void main(String[] args) {
	Scanner assasino = new Scanner(System.in);
	int contador = 0;
	String pergunta;
	String nome;
	
	
	System.out.println("digite seu nome: ");
	nome = assasino.nextLine();
	
	System.out.println("Telefonou para a vitima? [responda com sim oun não]");
	pergunta =  assasino.nextLine();
	if (pergunta.equalsIgnoreCase("sim")) {
		contador++;
	}
	System.out.println("esteve no local do crime? [responda com sim oun não]");
	pergunta = assasino.nextLine();
	if(pergunta.equalsIgnoreCase("sim")) {
		contador++;
	}
	System.out.println("mora perto da vitima? [responda com sim oun não]");
	c =  assasino.next().charAt(0);
	System.out.println("devia para vitima? [responda com sim oun não]");
	d =  assasino.next().charAt(0);
	System.out.println("ja trabalhou com a vitima? [responda com sim oun não]");
	e =  assasino.next().charAt(0);
	
	
	if(a =='s') {
		System.out.println();
	}else if(b == 's') {
		System.out.println();
	}
	
}
}

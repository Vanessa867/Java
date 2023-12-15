package fundamentos;
import java.util.Scanner;

public class ex2_gi {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.print("Digite um número de 1 a 7:");
	
	int numero = entrada.nextInt();
	
	String diasemana;
	
	switch(numero) {
	case 1:
		diasemana="domingo";
		break;
	case 2:
		diasemana="segunda";
		break;
	case 3:
		diasemana="terça";
		break;
	case 4:
		diasemana="quarta";
		break;
	case 5:
		diasemana="quinta";
		break;
	case 6:
		diasemana="sexta";
		break;
	case 7:
		diasemana="sábado";
		break;
	default:
		diasemana= " **opção inválida**";
		break;
		
	}
	System.out.println("O dia da semana corresponde a" +diasemana);
}
}

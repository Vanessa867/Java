package fundamentos;
import java.util.Scanner;
public class aula_de_gi {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite um número: ");
	int resp1 = entrada.nextInt();
	System.out.println(resp1);
	
	int resp2 = entrada.nextInt();
	System.out.println(resp2);
	
	int resp3 = entrada.nextInt();
	System.out.println(resp3);
	
	int maior= resp1;
	int menor= resp1;
	
	if (resp2>maior) {
		maior=resp2;
	}
	if (resp3>maior) {
		maior=resp3;
		
	}
	
	System.out.println("o maior numero é"+maior);
		
}
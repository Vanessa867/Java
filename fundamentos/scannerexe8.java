package fundamentos;
import java.util.Scanner;
public class scannerexe8 {
public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite um número: ");
	int resp1 = entrada.nextInt();
	System.out.println("Digite um número: ");
	
	int resp2 = entrada.nextInt();
	System.out.println("Digite um número: ");
	
	int resp3 = entrada.nextInt();
	
	
	
	if (resp1>resp2) {
		if (resp1 > resp3)
			System.out.println("o maior numero é"+resp1);
		else  {
			System.out.println("o maior numero é" +resp3);
		} 
	}
	else if (resp2 > resp3){
			System.out.println("o maior numero é"+resp2);
	
		}
		else {
			System.out.println("o maior numero é"+resp3);
		}
	

	if (resp1<resp2) {
		if (resp1 < resp3)
			System.out.println("o menor numero é"+resp1);
		else  {
			System.out.println("o menor numero é" +resp3);
		} 
	}
	else if (resp2 < resp3){
			System.out.println("o menor numero é"+resp2);
	
		}
		else {
			System.out.println("o menor numero é"+resp3);
		}
	}
	}





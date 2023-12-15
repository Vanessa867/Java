package fundamentos;
import java.util.Scanner;
public class aula2 {
public static void main(String[] args) {
	Scanner numero = new Scanner(System.in);
	double a;
	System.out.println("Digite um número: ");
	a = numero.nextDouble();
	
	if(a>=0) {
		System.out.println("Esse número é positivo");
	}else {
		System.out.println("Esse número é negativo");
	}
}
}

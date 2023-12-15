package fundamentos;
import java.util.Scanner;
public class a3e4 {
public static void main(String[] args) {
	Scanner num = new Scanner(System.in);
	int n = 0;
	int escrev;
	int par = 0;
	int impar = 0;
	
	System.out.println("Escreva um número:");
	escrev = num.nextInt();
	System.out.print("Aqui numeros pares: ");
		while (n <=escrev) {
			System.out.print(n%2==0 ? n+" ":"");
			par = ((n%2==0)? ++par:++impar);
			n++;
			}
		System.out.print("\ntem "+ par + " pares");
		
		n = 0;
		System.out.println("aqui números impares: ");
		while (n<=escrev) {
			System.out.print(n%2!=0? n+" ":"");
			n++;
		}
		System.out.print("\n tem "+ impar + " impares");
}
}

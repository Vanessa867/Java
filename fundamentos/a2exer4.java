package fundamentos;
import java.util.Scanner;
public class a2exer4 {
public static void main(String[] args) {
	Scanner media = new Scanner(System.in);
	double a, b, soma;
	
	System.out.println("Digite a primeira nota do(a) aluno(a): ");
	a = media.nextDouble();
	System.out.println("Digite a segunda nota do(a) aluno(a): ");
	b= media.nextDouble();
	
	soma = (a+b)/2;
		System.out.println(soma);
}
}

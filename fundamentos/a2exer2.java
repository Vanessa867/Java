package fundamentos;
import java.util.Scanner;
public class a2exer2 {
public static void main(String[] args) {
	Scanner num = new Scanner(System.in);
	double a, b, c;
	
	System.out.println("Dgite o primeiro número: ");
	a =  num.nextDouble();
	
	System.out.println("Digite o segundo número: ");
	b = num.nextDouble();
	
	System.out.println("Digite o terceiro número: ");
	c = num.nextDouble();
	
	if(a > b && a > c) {
		System.out.println("O primeiro número é o maior entre eles");
	}else if (b > a && b> c){
		System.out.println("O segundo número é o maior entre eles");
	}else {
		System.out.println("O terceiro número é o maior entre eles");
	}if (a < b && a < c) {
		System.out.println("O primeiro número é o menor");
	}else if (b < a && b< c){
		System.out.println("O segundo número é o menor");
	}else {
		System.out.println("O terceiro número é o menor");
	}
}
}

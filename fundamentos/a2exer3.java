package fundamentos;
import java.util.Scanner;
public class a2exer3 {
public static void main(String[] args) {
	Scanner dia = new Scanner(System.in);
	int num;
	
	System.out.println("Digite um número de 1 a 7 para os dias da semana: ");
	num = dia.nextInt();
	
	if(num == 1) {
		System.out.println("Domingo");
	}else if(num == 2){
		System.out.println("Segunda");
	}else if(num == 3) {
		System.out.println("Terça");
	}else if(num == 4) {
		System.out.println("Quarta");
	}else if(num == 5) {
		System.out.println("Quinta");
	}else if(num == 6) {
		System.out.println("Sexta");
	}else if(num ==7) {
		System.out.println("Sábado");
	}else {
		System.out.println("Número inválido!");
	}
}
}

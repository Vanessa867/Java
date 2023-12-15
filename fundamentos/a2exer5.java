package fundamentos;
import java.util.Scanner;
public class a2exer5 {
public static void main(String[] args) {
	
	Scanner sexo = new Scanner(System.in);
	char a;
	
	
	System.out.println("Digite F OU M: ");
	a = sexo.next().charAt(0);
	
	if(a == 'F' || a== 'f') {
		System.out.println("FEMININO");
	}else if (a == 'M'|| a=='m') {
		System.out.println("MASCULINO");
	}else {
		System.out.println("Letra invalida");
	}
	
	
}	
}

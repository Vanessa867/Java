package javapoo;

public class Calculadora {
public static void main(String[] args) {
	SomarMetodos some = new SomarMetodos();
	
	int a =5;
	int b = 5;
	int c = 5;
	int soma2 =0;
	int soma3 = 0;
	double multi = 0;
	
	soma2 = some.somar(a, b);
	soma3 = some.somar(a, b, c);
	
	System.out.printf("Os valores da soma de A e B é: %d", soma2);
	System.out.printf("Os valores da soma de A, B e C: %d", soma3);
	
}
}

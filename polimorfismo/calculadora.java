package polimorfismo;

public class calculadora {
	public static void main(String[] args) {
		double n1,n2,n3,n4,n5,n6,n7,n8;
		operações calcular = new operações();
		
		n1 = calcular.soma(8,6);
		n2 = calcular.soma(2,3,5);
		n3 = calcular.multiplicar(7, 7);
		n4 = calcular.multiplicar(6, 7, 8);
		n5 = calcular.dividir(2, 2);
		n6 = calcular.dividir(4, 2, 2);
		n7 = calcular.subitrair(10, 5);
		n8 = calcular.subitrair(8, 2, 3);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
	}
	
	
}

import java.util.Scanner;

public class exer3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        System.out.println("Digite o primeiro número inteiro: ");
        a = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        b = scanner.nextInt();

        if(a == b){
            c = a + b;
            System.out.println("Os números são iguais e a soma é: " + c);
        } else {
            c = a * b;
            System.out.println("Os números são diferentes e a multiplicação é: " + c);
        }
    }
}

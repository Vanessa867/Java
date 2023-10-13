import java.util.Scanner;

public class exer1 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double  a, b, c;

        System.out.println("Digite o primeiro número: ");
        a = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        b = scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        c = scanner.nextDouble();


        if (a + b <c){
            System.out.println("A soma de a + b é menor que c");
        } else {
            System.out.println("A soma de a + b é maior que c");
        }

    }
}

import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, numero3;

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        numero3 = scanner.nextInt();

        if (numero1 < numero2 && numero1 < numero3) {
            if (numero2 < numero3) {
                System.out.println("Os números em ordem crescente são: " + numero1 + ", " + numero2 + ", " + numero3);
            } else {
                System.out.println("Os números em ordem crescente são: " + numero1 + ", " + numero3 + ", " + numero2);
            }
        } else if (numero2 < numero1 && numero2 < numero3) {
            if (numero1 < numero3) {
                System.out.println("Os números em ordem crescente são: " + numero2 + ", " + numero1 + ", " + numero3);
            } else {
                System.out.println("Os números em ordem crescente são: " + numero2 + ", " + numero3 + ", " + numero1);
            }
        } else {
            if (numero1 < numero2) {
                System.out.println("Os números em ordem crescente são: " + numero3 + ", " + numero1 + ", " + numero2);
            } else {
                System.out.println("Os números em ordem crescente são: " + numero3 + ", " + numero2 + ", " + numero1);
            }
        }
    }
}


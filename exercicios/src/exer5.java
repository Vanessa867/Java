import java.util.Scanner;

public class exer5 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        var resul = 0;
        int numero;

        System.out.println("Digite um número: ");
        numero = scanner.nextInt();

        if(numero %2 ==0){
            resul = numero+5;
        } else {
            resul = numero +8;
        }

        System.out.println("O resultado da soma é: "+ resul);


    }
}

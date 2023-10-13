import java.util.Scanner;

public class exer4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero, resultado;

        System.out.println("Digite um número: ");
        numero= scanner.nextInt();

        if(numero>=0){
            resultado = numero * 2;
        } else{
            resultado = numero * 3;
        }
        System.out.println("O resultado é: "+ resultado);
    }
}

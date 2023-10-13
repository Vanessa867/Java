import java.util.Scanner;

public class exer8{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o preço do produto: ");
        double precoProduto = input.nextDouble();

        System.out.println("Escolha a condição de pagamento:");
        System.out.println("1 - À vista em dinheiro ou pix (10% de desconto)");
        System.out.println("2 - À vista no cartão de crédito (5% de desconto)");
        System.out.println("3 - Em duas vezes (preço normal sem juros)");
        System.out.println("4 - Em três vezes (preço normal mais juros de 5%)");

        int opcao = input.nextInt();
        double valorFinal = 0;

        switch (opcao) {
            case 1:
                valorFinal = precoProduto - (precoProduto * 0.10);
                break;
            case 2:
                valorFinal = precoProduto - (precoProduto * 0.05);
                break;
            case 3:
                valorFinal = precoProduto;
                break;
            case 4:
                valorFinal = precoProduto + (precoProduto * 0.05);
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        System.out.println("O valor a ser pago é: R$" + valorFinal);
    }
}

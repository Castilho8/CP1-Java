import java.util.Scanner;

// 10) Ler o preço de um produto e a forma de pagamento, mostrando o valor final
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dica: se for digitar um número com decimal, use vírgula. Ex: 100,0
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.println("Forma de pagamento:");
        System.out.println("1 - À vista (10% de desconto)");
        System.out.println("2 - Parcelado em 2x (sem juros)");
        System.out.println("3 - Parcelado em 4x (juros de 8%)");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        double valorFinal;

        if (opcao == 1) {
            valorFinal = preco - (preco * 0.10);
        } else if (opcao == 2) {
            valorFinal = preco;
        } else if (opcao == 3) {
            valorFinal = preco + (preco * 0.08);
        } else {
            valorFinal = 0;
            System.out.println("Opção inválida!");
        }

        System.out.println("Valor final a pagar: " + valorFinal);

        scanner.close();
    }
}

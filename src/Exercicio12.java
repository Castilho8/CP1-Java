import java.util.Scanner;

// 12) Ler a altura, o comprimento e a largura de uma caixa e calcular o volume
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dica: se for digitar um número com decimal, use vírgula. Ex: 2,5
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o comprimento: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a largura: ");
        double largura = scanner.nextDouble();

        double volume = altura * comprimento * largura;

        System.out.println("O volume da caixa é: " + volume);

        scanner.close();
    }
}

import java.util.Scanner;

// 15) Ler um número inteiro e exibir uma contagem regressiva até 0
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}

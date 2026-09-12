import java.util.Scanner;

// 7) Função que recebe dois números e retorna o maior deles
public class Exercicio7 {

    // Função que retorna o maior número
    public static double maior(double numero1, double numero2) {
        if (numero1 > numero2) {
            return numero1;
        } else {
            return numero2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dica: se for digitar um número com decimal, use vírgula. Ex: 3,5
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("O maior número é: " + maior(numero1, numero2));

        scanner.close();
    }
}

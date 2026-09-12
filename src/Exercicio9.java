import java.util.Scanner;

// 9) Função que recebe três números e retorna a média aritmética
public class Exercicio9 {

    // Função que calcula a média
    public static double media(double numero1, double numero2, double numero3) {
        return (numero1 + numero2 + numero3) / 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dica: se for digitar um número com decimal, use vírgula. Ex: 7,5
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        double resultado = media(numero1, numero2, numero3);
        System.out.println("A média é: " + resultado);

        scanner.close();
    }
}

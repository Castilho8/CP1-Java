import java.util.Scanner;

// 14) Função que recebe a temperatura em Fahrenheit e retorna em Celsius
public class Exercicio14 {

    // Função que converte Fahrenheit em Celsius
    public static double paraCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dica: se for digitar um número com decimal, use vírgula. Ex: 98,6
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = paraCelsius(fahrenheit);
        System.out.println(fahrenheit + " °F equivalem a " + celsius + " °C");

        scanner.close();
    }
}

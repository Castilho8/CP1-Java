import java.util.Scanner;

// 1) Ler um número em metros e converter para centímetros e milímetros
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dica: se for digitar um número com decimal, use vírgula. Ex: 1,5
        System.out.print("Digite um valor em metros: ");
        double metros = scanner.nextDouble();

        double centimetros = metros * 100;
        double milimetros = metros * 1000;

        System.out.println(metros + " metros = " + centimetros + " centímetros");
        System.out.println(metros + " metros = " + milimetros + " milímetros");

        scanner.close();
    }
}

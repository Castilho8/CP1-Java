import java.util.Scanner;

// 5) Ler 10 números inteiros e calcular quantos são pares e quantos são ímpares
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares = pares + 1;
            } else {
                impares = impares + 1;
            }
        }

        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);

        scanner.close();
    }
}

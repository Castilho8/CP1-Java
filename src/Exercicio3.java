import java.util.Scanner;

// 3) Ler dois números e mostrar todos os números inteiros entre eles
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int menor;
        int maior;

        if (num1 < num2) {
            menor = num1;
            maior = num2;
        } else {
            menor = num2;
            maior = num1;
        }

        System.out.println("Números entre " + num1 + " e " + num2 + ":");
        for (int i = menor + 1; i < maior; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}

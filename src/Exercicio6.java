import java.util.Scanner;

// 6) Função que recebe um número inteiro e mostra a tabuada dele até 10
public class Exercicio6 {

    // Função que mostra a tabuada
    public static void tabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        tabuada(numero);

        scanner.close();
    }
}

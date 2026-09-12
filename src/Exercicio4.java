import java.util.Scanner;

// 4) Função que recebe um número inteiro e retorna o fatorial dele
public class Exercicio4 {

    // Função do fatorial
    public static int fatorial(int numero) {
        int resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int resultado = fatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado);

        scanner.close();
    }
}

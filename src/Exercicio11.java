import java.util.Scanner;

// 11) Ler o nome e a idade de 3 pessoas e mostrar o nome da pessoa mais velha
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da 1ª pessoa: ");
        String nome1 = scanner.next();
        System.out.print("Digite a idade da 1ª pessoa: ");
        int idade1 = scanner.nextInt();

        System.out.print("Digite o nome da 2ª pessoa: ");
        String nome2 = scanner.next();
        System.out.print("Digite a idade da 2ª pessoa: ");
        int idade2 = scanner.nextInt();

        System.out.print("Digite o nome da 3ª pessoa: ");
        String nome3 = scanner.next();
        System.out.print("Digite a idade da 3ª pessoa: ");
        int idade3 = scanner.nextInt();

        String maisVelha;

        if (idade1 >= idade2 && idade1 >= idade3) {
            maisVelha = nome1;
        } else if (idade2 >= idade1 && idade2 >= idade3) {
            maisVelha = nome2;
        } else {
            maisVelha = nome3;
        }

        System.out.println("A pessoa mais velha é: " + maisVelha);

        scanner.close();
    }
}

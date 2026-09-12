import java.util.Scanner;

// 8) Ler altura e peso de uma pessoa, calcular o IMC e mostrar a classificação
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dica: se for digitar um número com decimal, use vírgula. Ex: 1,75
        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o peso em kg: ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }

        scanner.close();
    }
}

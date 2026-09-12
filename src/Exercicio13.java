// 13) Criar dois objetos da classe Car (veja o arquivo Car.java) e exibir as informações
public class Exercicio13 {
    public static void main(String[] args) {
        Car carro1 = new Car("Toyota", "Corolla", 2020);
        Car carro2 = new Car("Honda", "Civic", 2022);

        System.out.println("Carro 1:");
        carro1.mostrarInformacoes();

        System.out.println();

        System.out.println("Carro 2:");
        carro2.mostrarInformacoes();
    }
}

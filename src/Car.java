// Classe Car com os atributos: brand, model, year
public class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void mostrarInformacoes() {
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Ano: " + year);
    }
}

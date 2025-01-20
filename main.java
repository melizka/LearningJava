class Car {
    String brand;
    int year;

    // Конструктор
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}

public class main {
    public static void main(String[] args) {

        Car car1 = new Car("toyota", 2020);
        Car car2 = new Car("toyota", 2020);

        System.out.println("Результат ==: " + (car1 == car2));
        System.out.println("Результат equals(): " + car1.equals(car2));
    }
}
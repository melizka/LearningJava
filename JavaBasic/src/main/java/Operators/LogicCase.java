package Operators;

class Car {
    String brand;
    int year;

    // Конструктор
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}

public class LogicCase {
    public static void main(String[] args) {

        String car1 = new String("toyota");
        String car2 = new String("toyota");

        System.out.println("Результат ==: " + (car1 == car2));
        System.out.println("Результат equals(): " + car1.equals(car2));
    }
}
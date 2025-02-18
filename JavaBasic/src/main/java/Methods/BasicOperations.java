package Methods;

public class BasicOperations {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int sum = add(num1, num2);
        System.out.println("Сума: " + sum); // Додавання

        int difference = subtract(num1, num2);
        System.out.println("Різниця: " + difference); // Віднімання

        int product = multiply(num1, num2);
        System.out.println("Добуток: " + product); // Множення

        double quotient = divide(num1, num2);
        System.out.println("Частка: " + quotient);
}

    // Метод для додавання
    public static int add(int a, int b) {
        return a + b;
    }

    // Метод для віднімання
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Метод для множення
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Метод для ділення
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Помилка: ділення на нуль!");
            return 0;
        }
        return (double) a / b;
    }
}
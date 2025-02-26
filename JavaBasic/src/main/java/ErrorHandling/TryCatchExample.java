package ErrorHandling;

import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = null; // Оголошуємо змінну перед блоком try

        try {
            scanner = new Scanner(System.in);

            System.out.print("Введіть чисельник: ");
            int numerator = scanner.nextInt();

            System.out.print("Введіть знаменник: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Помилка: не можна ділити на нуль!");
        } catch (Exception e) {
            System.out.println("Сталася помилка: " + e.getMessage());
        } finally {
            if (scanner != null) { // Перевіряємо, чи Scanner було ініціалізовано
                scanner.close();
            }
            System.out.println("Програма завершена.");
        }
    }
}
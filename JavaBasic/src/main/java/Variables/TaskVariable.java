//1. Змінні та типи даних
//
//Завдання:
//Напиши програму, яка:
//
//    Створює змінні для зберігання:
//        цілого числа (int),
//        числа з плаваючою точкою (double),
//        логічного значення (boolean),
//        рядка (String).
//    Присвоює кожній змінній значення.
//    Виводить значення всіх змінних на екран.

package Variables;

public class TaskVariable {
    public static void main(String[] args){

    int num = 10;
        double num1 = 5.5;
        boolean logik = true;
        String greeting = "Hello, Java!";

        System.out.println("Ціле число: " + num);
        System.out.println("Число з плаваючою точкою: " + num1);
        System.out.println("Логічне значення: " + logik);
        System.out.println("Рядок: " + greeting);
    }
}

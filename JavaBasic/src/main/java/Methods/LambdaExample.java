
//2.Функціональні вирази (Lambda Expressions)

//(parameters) -> expression

//parameters — це параметри, які передаються у функцію.
//expression — це тіло функції (вираз, який виконується).
package Methods;

import java.util.function.BinaryOperator;

public class LambdaExample {
    public static void main(String[] args) {
        // Створюємо функцію для додавання двох чисел
        BinaryOperator<Integer> add = (a, b) -> a + b;

        // Викликаємо лямбда-функцію
        int sum = add.apply(5, 10);
        System.out.println("Сума: " + sum);
    }
}
//BinaryOperator<Integer> add = (a, b) -> a + b; — ми створюємо лямбда-вираз, який приймає два числа і повертає їх суму.
        //add.apply(5, 10) — викликаємо функцію і передаємо аргументи.
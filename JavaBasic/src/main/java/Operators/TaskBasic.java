package Operators;

public class TaskBasic {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        int a = 1;
        int b = 2;

        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a - b);
        System.out.println(a + b);
    }

    public static void task2() {
        int a = 4;
        int b = 7;

        boolean isGreaterThan = a > b || b > a;
        boolean areBothEven = a % 2 == 0 && b % 2 == 0;

        if (isGreaterThan && areBothEven) {
            System.out.println("Одне число більше за інше, і обидва числа парні.");
        } else {
            System.out.println("Умова не виконується.");
        }
    }
}

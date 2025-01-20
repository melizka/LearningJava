public class operators {

    public static void main(String[] args) {

        // Завдання 1
        task1();

        // Завдання 2
        task2();

        task3();

        task4();

        task5();

        task6();


    }

    // Завдання 1
    public static void task1() {
        int num = 15;
        boolean isGreaterThanTen = num > 10;
        boolean isEven = num % 2 == 0;

        if (isGreaterThanTen && isEven) {
            System.out.println("Число більше 10 і парне.");
        } else {
            System.out.println("Число не відповідає умові.");
        }
    }

    //Завдання 2
    public static void task2() {
        int age = 10;
        boolean isGreaterThanEighteen = age > 18;
        boolean isSmallerThanSixty = age < 60;

        if (isGreaterThanEighteen && isSmallerThanSixty) {
            System.out.println("Вік підходить для роботи");
        } else {
            System.out.println("Вік не підходить для роботи");
        }
    }

    //Завдання 3
    public static void task3() {
        boolean isBlocked = false;
        // Перевірка, чи користувач НЕ заблокований
        if (!isBlocked) {
            System.out.println("Користувач активний.");
        } else {
            System.out.println("Користувач заблокований.");
        }
    }

    //Завдання 4
    public static void task4() {

        int num1 = 5;
        int num2 = 6;
        if (num1 == num2) {
            System.out.println("числа рівні");
        } else {
            System.out.println("числа не рівні");
        }
    }

    //Завдання 5 Метод equals() перевіряє, чи вміст двох об'єктів однаковий. Для рядків він порівнює всі символи в рядках. Якщо рядки мають однаковий вміст, метод equals() повертає true.
    public static void task5() {
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println(str1 == str2);  // false, бо це різні об'єкти в пам'яті

        String str3 = "Hello";
        String str4 = "Hello";

        System.out.println(str3 == str4);  // true, бо це однаковий об'єкт у пулі літералів
    }

    //Завдання 6. Оператор == та equals() Уявіть, що у вас є дві адреси:
    //
    //    str1 вказує на будинок з написом "Hello".
    //    str2 також вказує на будинок з написом "Hello", але це два різних будинки.
    //
    //Оператор == перевіряє, чи це одна і та ж адреса.
    //Метод equals() перевіряє, чи однаковий текст на обох будинках.

    public static void task6() {
        String str1 = "Hello";
        String str3 = "Bye";

        String str2 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str2));
    }
}


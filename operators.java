public class operators {

    public static void main(String[] args) {

        // Завдання 1
        task1();

        // Завдання 2
        task2();

        task3();

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
        int age = 25;
        boolean isGreaterThanEighteen = age > 18;
        boolean isSmallerThanSixty = age < 60;

        if (isGreaterThanEighteen && isSmallerThanSixty) {
            System.out.println("Вік підходить для роботи");
        }else{
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
}

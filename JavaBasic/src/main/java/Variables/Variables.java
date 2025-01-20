package Variables;

public class Variables {

    public static void main(String[] args) {
        // Завдання 1: Робота зі змінними
        task1();

        // Завдання 2: Розрахунок суми чисел
        task2();

        // Завдання 3: Логічні завдання
        task3();

        // Завдання 4: Масиви
        task4();

        //Завдання 5: Робота з рядками
        task5();

    }

    // Завдання 1: Робота зі змінними
    public static void task1() {
        int age = 25;
        double weight = 70.5;
        boolean isStudent = true;
        String name = "Yelizaveta";

        System.out.println("\nІм'я: " + name);
        System.out.println("Вік: " + age);
        System.out.println("Вага: " + weight);
        System.out.println("Студент: " + isStudent);
    }

    // Завдання 2: Розрахунок суми чисел
    public static void task2() {
        int a = 10;
        int b = 15;
        int sum = a + b;
        System.out.println("Сума чисел 10 та 15 дорівнює " + sum);
    }

    // Завдання 3: Логічні завдання
    public static void task3() {
        int age2 = 20;
        boolean isAdult = age2 >= 18;
        System.out.println("Користувач дорослий: " + isAdult);

        int age3 = 17;
        boolean isAdult1 = age3 >= 18;
        System.out.println("Користувач дорослий: " + isAdult1);
    }

    // Завдання 4: Масиви
    public static void task4() {
        int[] numbers = {85, 90, 78, 92};

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Сума чисел у масиві: " + sum);
    }

    //Завдання 5: Робота з рядками
    public static void task5() {
        String firstName = "Yelyzaveta";
        String lastName = "Melnyk";
        String fullName = firstName + " " + lastName;

        System.out.println("Повне ім'я: " + fullName);
    }
}






package Methods;
 // 1. ОГОЛОШЕННЯ ФУНКЦІЙ
//public class MethodExample {

    //public static returnType methodName(parameter1, parameter2, ...) {
        // Тіло методу
        //return returnValue; // Якщо метод має тип, відмінний від void
    //}

//public — це модифікатор доступу, який означає, що метод доступний з будь-якої частини програми.
//static — означає, що метод належить класу, а не конкретному об'єкту.
//returnType — це тип значення, яке метод повертає. Якщо метод не повертає значення, використовується void.
//methodName — це ім'я методу.
//parameters — це параметри методу (значення, які метод приймає для виконання своєї роботи).
//}

public class MethodExample {
    public static void main(String[] args) {
        // Викликаємо метод без параметрів
        printMessage();

        // Викликаємо метод з параметрами
        int sum = add(5, 10);
        System.out.println("Сума: " + sum);
    }

    // Метод без параметрів
    public static void printMessage() {
        System.out.println("Привіт, світ!");
    }

    // Метод з параметрами
    public static int add(int a, int b) {
        return a + b;  // Повертає суму двох чисел
    }
}




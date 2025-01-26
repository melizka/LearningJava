//2. Відмінності між примітивними та об’єктними типами
//
//Завдання:
//Створити два об'єкти:
//
//    Примітивний тип: int (ціле число).
//    Об'єктний тип: Integer (клас-обгортка для int).
//
//Порівняти їх значення за допомогою оператора == та методу equals() і пояснити, як це працює.

package Variables;

public class Task2Variables {
    public static void main(String[] args){

        int num = 2;
        Integer integer = 2;

        System.out.println(num == integer);
        System.out.println(integer.equals(num));

    }
}

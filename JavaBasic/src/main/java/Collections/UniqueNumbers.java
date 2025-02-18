package Collections;

import java.util.HashSet;
import java.util.ArrayList;

public class UniqueNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(5);
        numbers.add(75);
        numbers.add(649);
        numbers.add(34);
        numbers.add(143);
        numbers.add(9);
        numbers.add(4667);
        numbers.add(34);
        numbers.add(643);
        numbers.add(1);

        System.out.println("Числа в ArrayList: " + numbers);

        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println("Унікальні числа в HashSet: " + uniqueNumbers);
    }
}

package Collections;
import java.util.HashSet;

public class PhoneNumbers {
    public static void main(String[]args) {
        HashSet<String>numbers=new HashSet<>();

        numbers.add("0982438200");
        numbers.add("0682133221");
        numbers.add("0980930759");
        numbers.add("0982438200");
        numbers.add("0682133221");

        System.out.println(numbers);

        numbers.remove("0982438200");
        System.out.println(numbers);

    }
}

package Cycles;

public class For2Class {

    public static void main(String[] args) {

        int number = 7;

        System.out.println("Multiplication table " + number + ":");

        for (int chyslo = 1; chyslo <= 10; chyslo++) {
            int result = number * chyslo;
            System.out.println(number + "x" + chyslo + " = " + result);
        }
    }
}

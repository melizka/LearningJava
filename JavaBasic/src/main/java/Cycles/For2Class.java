package Cycles;

public class For2Class {

    public static void main(String[] args) {

        int num = 7;

        System.out.println("Multiplication table " + num + ":");

        for (int a = 1; a <= 10; a++) {
            int result = num * a;
            System.out.println(num + "x" + a + " = " + result);
        }
    }
}

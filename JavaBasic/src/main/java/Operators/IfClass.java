package Operators;

public class IfClass {
    public static void main (String[]  args) {
        int price_toyota = 10000;
        int price_skoda = 9000;
        int price_ferrari = 15000;

        int salary = 200000;

        if (salary >= price_skoda)
        {
            System.out.println("I can buy a skoda car");
        }
        else if (salary >= price_ferrari)
        {
            System.out.println("I can buy a ferrari car");
        }
        else if (salary >= price_toyota)
        {
            System.out.println("I can buy a toyota car");
        }
        else
        {
            System.out.println("It look like you will go on foot");
        }

    }
}

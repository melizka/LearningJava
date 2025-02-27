package Cycles;

import java.util.Scanner;

public class While2Class {

    public static void main(String[] args) {

        Scanner skan = new Scanner(System.in);
        String a = "";

        while (a.equalsIgnoreCase("чай") != true)
        {
            System.out.println("хочу чаю");
            a = skan.nextLine();
        }
        System.out.println("Дякую");
    }

}

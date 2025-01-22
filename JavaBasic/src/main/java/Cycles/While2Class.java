package Cycles;

import java.util.Scanner;

public class While2Class {

    public static void main(String[] args) {

        Scanner skan = new Scanner(System.in);
        String slovo = "";

        while (slovo.equals("чай") != true)
        {
            System.out.println("хочу чаю");
            slovo = skan.nextLine();
        }
        System.out.println("Дякую");
    }

}

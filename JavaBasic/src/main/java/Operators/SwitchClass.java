package Operators;

import java.util.Scanner;

public class SwitchClass {
    public static void main (String[] args) {

        System.out.println("Введіть першу літеру вашої області:");
        String litera = "";
        Scanner skan = new Scanner(System.in);

        litera = skan.nextLine();
        litera = litera.toUpperCase();

        switch (litera) {
            case "В":
                System.out.println("Вінницька або Волинська");
                break;
            case "Д":
                System.out.println("Дніпропетровська або Донецька");
                break;
            case "Ж":
                System.out.println("Житомирська");
                break;
            case "К":
                System.out.println("Кіровоградська або Крим");
                break;
            default:
                System.out.println("Області не знайдено");
        }
    }
}

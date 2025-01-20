package Cycles;

import java.util.Scanner;

public class WhileClass {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String password = "";
        String correctPassword = "Yelyzaveta";

        while (!password.equals(correctPassword)) {
            System.out.println("Enter your password");
            password = scan.nextLine();

        }
        System.out.println("Succsessfull!");
        scan.close();
    }
}

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

            if (password == null || password.isEmpty()) {
                System.out.println("Password cannot be empty. Please enter a valid password:");
                continue;
            }
                if (!password.equals(correctPassword)) {
                    System.out.println("Incorrect password. Try again.");
                }
            }

            System.out.println("Successful login!");
        scan.close();
        }
    }

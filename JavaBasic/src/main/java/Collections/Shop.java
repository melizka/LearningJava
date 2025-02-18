package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        HashMap<String, Integer> goods = new HashMap<>();

        goods.put("snickers", 45);
        goods.put("cheese", 75);
        goods.put("tomato", 19);
        goods.put("batomchik", 60);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть назву товару: ");
        String productName = scanner.nextLine();

        if (goods.containsKey(productName)) {

            System.out.println("Price " + productName + ": " + goods.get(productName));
        } else {
            System.out.println("There isn't any goods");
        }
        scanner.close();
    }
}



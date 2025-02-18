package Operators;

import java.util.HashMap;
import java.util.Map;

public class IfClass {
    public static void main (String[] args) {
        Map<String, Integer> cars = new HashMap<>();
        cars.put("Ferrari", 15000);
        cars.put("Toyota", 10000);
        cars.put("Skoda", 9000);

        int salary = 200000;
        String bestCar = "It looks lke you will go on foot";

        for (Map.Entry<String, Integer> entry : cars.entrySet()) {
            if (salary >= entry.getValue() &&
                (bestCar.equals("It looks like you will go on foot") ||
                entry.getValue() > cars.getOrDefault(bestCar, 0))) {
                bestCar = entry.getKey();
            }
        }
        System.out.println("I can buy a " + bestCar);

    }
}

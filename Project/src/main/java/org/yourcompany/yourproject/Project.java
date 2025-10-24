package org.yourcompany.yourproject;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Project {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<Address, Integer> costPerAddress = new HashMap<>();
        Set<String> uniqueCountries = new HashSet<>();
        String input = "";
        int valueCounter = 0;
        int uniqCounter = 0;
        costPerAddress.put(new Address("Россия", "Иркутск"), 15);
        costPerAddress.put(new Address("Россия", "Москва"), 15);
        costPerAddress.put(new Address("США", "Нью-Йорк"), 15);

        while (true) {
            Address inputAddress = new Address();

            int inputWeight;
            boolean flag = false;

            System.out.println("Заполнение нового заказа");
            System.out.print("Введите страну: ");
            input = scanner.nextLine();
            if (input.contains("end")) {
                break;
            }
            inputAddress.country = input;
            System.out.print("Введите город: ");
            input = scanner.nextLine();
            if (input.contains("end")) {
                break;
            }
            inputAddress.city = input;
            System.out.print("Введите вес(кг): ");
            input = scanner.nextLine();
            if (input.contains("end")) {
                break;
            }
            inputWeight = Integer.parseInt(input);
            for (Map.Entry<Address, Integer> kv : costPerAddress.entrySet()) {
                if (kv.getKey().equals(inputAddress)) {
                    flag = true;
                    int value = inputWeight * kv.getValue();
                    uniqueCountries.add(inputAddress.country);
                    valueCounter += value;
                    System.out.println("Стоимость доставки составит :" + value);
                    break;
                } else {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("Общая стоимость всех доставок: " + valueCounter);
                System.out.println("Уникальных стран: " + uniqueCountries.size());
            } else {
                System.out.println("Доставки по этому адресу нет");
            }
        }

    }

}

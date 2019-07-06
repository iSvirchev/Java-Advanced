package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        CustomList<String> customList = new CustomList<>();

        while (!"END".equalsIgnoreCase(str)) {
            String[] tokens = str.split("\\s+");

            switch (tokens[0]) {
                case "Add":
                    customList.add(tokens[1]);
                    break;
                case "Remove":
                    customList.remove(Integer.parseInt(tokens[1]));
                    break;
                case "Contains":
                    customList.contains(tokens[1]);
                    break;
                case "Swap":
                    customList.swap(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]));
                    break;
                case "Greater":
                    System.out.println(customList.countGreaterThan(tokens[1]));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    customList.printList();
                    break;

            }

            str = scanner.nextLine();
        }
    }
}

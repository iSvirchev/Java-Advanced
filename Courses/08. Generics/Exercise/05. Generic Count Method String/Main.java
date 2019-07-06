package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Box<String>> boxes = new ArrayList<>();

        while (n-- > 0){
            String str = scanner.nextLine();

            Box<String> box = new Box<>(str);
            boxes.add(box);
        }

        String element= scanner.nextLine();
        int count = countGreaterElements(boxes,element);

        System.out.println(count);
    }

    private static <T extends Comparable<T>> int countGreaterElements(List<Box<T>> boxes, T element) {
        int count = 0;

        for (Box<T> box : boxes) {
            if(box.getElement().compareTo(element) > 0){
                count++;
            }
        }

        return count;
    }
}

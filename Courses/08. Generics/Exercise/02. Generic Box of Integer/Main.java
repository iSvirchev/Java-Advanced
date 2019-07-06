package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        while (n-- > 0) {
            String str = scanner.nextLine();
            Box<Integer> box = new Box<>(Integer.parseInt(str));

            System.out.println(box.toString());
        }


    }
}

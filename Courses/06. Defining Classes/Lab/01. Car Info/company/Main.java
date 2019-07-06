package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nCars = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        while (nCars-- > 0) {
            String[] carElem = scanner.nextLine().split("\\s+");
            String make = carElem[0];
            String model = carElem[1];
            int hp = Integer.parseInt(carElem[2]);

            Car car = new Car();
            car.setMake(make);
            car.setModel(model);
            car.setHorsePower(hp);

            cars.add(car);
        }

        for (Car car : cars) {
            String toString = String
                    .format("The car is: %s %s - %d HP.",
                            car.getMake(),
                            car.getModel(),
                            car.getHorsePower());

            System.out.println(toString);
        }
    }
}

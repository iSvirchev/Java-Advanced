package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        while (n-->0){
            String[] carElem = scanner.nextLine().split("\\s+");

            Car car = new Car(carElem[0]);

            if(carElem.length>1){
                car = new Car(carElem[0],carElem[1],Integer.parseInt(carElem[2]));
            }

            cars.add(car);
        }

        for (Car car : cars) {
            String toString = String
                    .format("The car is: %s %s - %d HP."
                    ,car.getMake()
                    ,car.getModel()
                    ,car.getHorsePower());
            System.out.println(toString);
        }

    }
}

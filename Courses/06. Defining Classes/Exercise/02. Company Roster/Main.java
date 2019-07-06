package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Employee> employees = new ArrayList<>();
        Map<String, List<Double>> depSalary = new HashMap<>();

        while (n-- > 0) {
            String[] elements = scanner.nextLine().split("\\s+");
            String name = elements[0];
            double salary = Double.parseDouble(elements[1]);
            String position = elements[2];
            String department = elements[3];
            Employee emp;
            if (elements.length == 4) {
                emp = new Employee(name, salary, position, department);
                employees.add(emp);
            } else if (elements.length == 5) {
                if (elements[4].contains("@")) {
                    String email = elements[4];
                    emp = new Employee(name, salary, position, department, email);
                    employees.add(emp);
                } else {
                    int age = Integer.parseInt(elements[4]);
                    emp = new Employee(name, salary, position, department, age);
                    employees.add(emp);
                }
            } else {
                String email = elements[4];
                int age = Integer.parseInt(elements[5]);
                emp = new Employee(name, salary, position, department, email, age);
                employees.add(emp);
            }

            if (!depSalary.containsKey(department)) {
                depSalary.put(department, new ArrayList<>());
                depSalary.get(department).add(0, 1.0);
                depSalary.get(department).add(1, salary);
            } else {
                depSalary.get(department).set(0, depSalary.get(department).get(0) + 1);
                depSalary.get(department).set(1, depSalary.get(department).get(1) + salary);
            }
        }

        double highestAvg = 0;
        String highestDep = "";
        for (Map.Entry<String, List<Double>> kvp : depSalary.entrySet()) {
            double nEmployees = kvp.getValue().get(0);
            double totalSalaryPerDep = kvp.getValue().get(1);

            double depAvg = totalSalaryPerDep / nEmployees;
            if (depAvg > highestAvg) {
                highestAvg = depAvg;
                highestDep = kvp.getKey();
            }
        }

        final String bestDep = highestDep;
        System.out.println("Highest Average Salary: " + bestDep);
        employees.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase(bestDep))
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(e -> System.out.println(String.format("%s %.2f %s %d",
                        e.getName(),
                        e.getSalary(),
                        e.getEmail(),
                        e.getAge())));
    }
}

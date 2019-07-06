package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> bankAccountMap = new HashMap<>();

        String line = scanner.nextLine();
        while (!"End".equalsIgnoreCase(line)) {
            String[] elem = line.split("\\s+");

            switch (elem.length) {
                case 1:
                    BankAccount bankAccount = new BankAccount();
                    bankAccountMap.put(bankAccount.getId(), bankAccount);
                    System.out.println(String.format("Account ID%d created", bankAccount.getId()));
                    break;
                case 2:
                    double rate = Double.parseDouble(elem[1]);
                    BankAccount.setInterestRate(rate);
                    break;
                case 3:
                    int id = Integer.parseInt(elem[1]);

                    if (!bankAccountMap.containsKey(id)) {
                        System.out.println("Account does not exist");
                    }else{
                        BankAccount ba1 = bankAccountMap.get(id);
                        if ("Deposit".equalsIgnoreCase(elem[0])) {
                            double amount = Double.parseDouble(elem[2]);
                            ba1.deposit(amount);
                            System.out.println(String.format("Deposited %.0f to ID%d",amount,id));
                        } else {
                            int years = Integer.parseInt(elem[2]);
                            System.out.println(String.format("%.2f",ba1.getInterest(years)));
                        }
                    }
                    break;
            }
            line = scanner.nextLine();
        }

    }
}

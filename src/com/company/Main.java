package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Top up the balance: ");
        bankAccount.deposit(scanner.nextDouble());
        while (true) {
            try {
                System.out.print("Write the withdrawal amount: ");
                bankAccount.withDraw(scanner.nextInt());

            } catch (LimitException limitException) {
                System.out.println(limitException.getMessage());
                try {
                    bankAccount.withDraw((int) limitException.getRemainingAmmount());
                } catch (LimitException e) {
                    e.printStackTrace();
                }
                break;
            }
        }



    }
}

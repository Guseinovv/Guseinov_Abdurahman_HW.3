package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double som)throws LimitException{
        amount += som;
        System.out.println("You topped up your balance: " + (int) getAmount() + " Som");
    }
    public void withDraw(int som) throws LimitException{

            if (som > amount) {
                throw new LimitException("Error your balance is null: ", amount);
            } else {
                amount -= som;
                System.out.println("You removed: " + som + " Som" + " Your balance: " + amount);
            }
        }
    }


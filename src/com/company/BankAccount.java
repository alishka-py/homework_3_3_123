package com.company;

public class BankAccount {
    private double amount;
    private String amount2;

    public String getAmount2() {
        return amount2;
    }

    public BankAccount(String amount2) {
        this.amount2 = amount2;
    }

    public BankAccount() {
    }

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    public double deposit(double sum) {
        return this.amount += sum;

    }

    public double withDraw(double sum) throws LimitException {
        if (sum >= this.amount) {
            throw new LimitException("Ошибка! Сумма снятия больше чем баланс",this.amount);
        } else {
            return this.amount -= sum;
        }
    }



}
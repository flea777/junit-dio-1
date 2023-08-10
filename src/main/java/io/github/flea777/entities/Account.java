package io.github.flea777.entities;

public class Account {

    private String accountNumber;
    private int balance;

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void throwsCredit(int value) {
        balance += value;
    }

    public void throwsDebit(int value) {
        balance -= value;
    }
}

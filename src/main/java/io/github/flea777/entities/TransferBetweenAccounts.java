package io.github.flea777.entities;

public class TransferBetweenAccounts {

    public void transfer(Account originAccount, Account destinationAccount, int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Value must be higher than 0");
        }
    }
}

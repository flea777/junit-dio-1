package io.github.flea777.junit;

import io.github.flea777.entities.Account;
import io.github.flea777.entities.TransferBetweenAccounts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validateExceptionScenarioOnTransfer() {
        Account originAccount = new Account("1234", 0);
        Account destinationAccount = new Account("5678", 100);

        TransferBetweenAccounts transferBetweenAccounts = new TransferBetweenAccounts();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transferBetweenAccounts.transfer(originAccount, destinationAccount, -1));
    }
}

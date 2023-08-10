package io.github.flea777.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {

    @Test
    void validateSomethingOnlyInPedroUser() {
        Assumptions.assumeTrue("Pedro".equals(System.getenv("HOME")));
        Assertions.assertEquals(10, 5 + 5);
    }
}

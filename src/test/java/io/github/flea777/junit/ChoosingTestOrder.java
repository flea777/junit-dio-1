package io.github.flea777.junit;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.Random.class)
public class ChoosingTestOrder {

    @Test
    void validateFlowA() {
        Assertions.assertTrue(true);
    }

    @Test
    void validateFlowB() {
        Assertions.assertTrue(true);
    }

    @Test
    void validateFlowC() {
        Assertions.assertTrue(true);
    }

    @Test
    void validateFlowD() {
        Assertions.assertTrue(true);
    }
}

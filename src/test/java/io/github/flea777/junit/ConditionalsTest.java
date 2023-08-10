package io.github.flea777.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalsTest {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    @EnabledOnJre(JRE.JAVA_17)
    void validateSomethingOnlyInPedroUser() {
        Assertions.assertEquals(10, 5 + 5);
    }
}

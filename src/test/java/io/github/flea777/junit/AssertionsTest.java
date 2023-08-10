package io.github.flea777.junit;

import io.github.flea777.entities.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AssertionsTest {

    @Test
    void throwValidate() {
        int[] firstThrow = {10, 20, 30, 40, 50};
        int[] secondThrow = {10, 20, 30, 40, 50};

        Assertions.assertArrayEquals(firstThrow, secondThrow);
    }

    @Test
    void nullObjectValidate() {
        Person person = null;

        Assertions.assertNull(person);

        Person harry = new Person("Harry", LocalDate.now());

        Assertions.assertNotNull(harry);
    }
}

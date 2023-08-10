package io.github.flea777.junit;

import io.github.flea777.entities.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PersonTest {

    @Test
    void mustCalculateAgeCorrectly() {
        Person billy = new Person("Billy", LocalDate.of(2013, 06, 14));
        Assertions.assertEquals(10, billy.getAge());
    }

    @Test
    void mustReturnMaiority() {
        Person joaquim = new Person("Joaquim", LocalDate.of(2019, 10, 12));
        Assertions.assertFalse(joaquim.maiority());
    }
}

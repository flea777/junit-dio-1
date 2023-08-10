package io.github.flea777.junit;

import io.github.flea777.entities.Database;
import io.github.flea777.entities.Person;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class PersonDataConsultTest {

    @BeforeAll
    static void configuresConnection() {
        Database.startConnection();
    }

    @BeforeEach
    void insertDataForTest() {
        Database.insertData(new Person("Jake", LocalDate.of(1996, 5, 30)));
    }

    @AfterEach
    void removeDataFromTest() {
        Database.removeData(new Person("Jake", LocalDate.of(1996, 5, 30)));
    }

    @Test
    void validateReturnData() {
        Assertions.assertTrue(true);
    }

    @Test
    void validateReturnData2() {
        Assertions.assertNotNull(new Person("Jake", LocalDate.of(1996, 5, 30)));
    }

    @AfterAll
    static void endDatabaseConnection() {
        Database.endConnection();
    }
}

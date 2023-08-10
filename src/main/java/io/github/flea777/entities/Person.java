package io.github.flea777.entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {

    private String name;
    private LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        return (int) ChronoUnit.YEARS.between(birthDate, LocalDate.now());
    }

    public boolean maiority() {
        return getAge() > 17;
    }
}

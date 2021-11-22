package day01;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Human {

    private String name;

    private int yearOfBirth;

    public Human(String name, int yearOfBirth) {
        if (name.split(" ").length < 2) {
            throw new IllegalArgumentException("A nev minimumm 2 tagu kell hogy legyen!");
        }
        this.name = name;
        if (LocalDateTime.now().getYear() - yearOfBirth > 120) {
            throw new IllegalArgumentException("Az eletkor nem lehet tobb 120-nal.");
        }
        this.yearOfBirth = yearOfBirth;

    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}

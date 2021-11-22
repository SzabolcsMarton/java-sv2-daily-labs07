package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    void createHumanTest(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Human("Sanyi Bacsi", 121));
        assertEquals("Az eletkor nem lehet tobb 120-nal.",exception.getMessage());


    }

    @Test
    void createHumanTest2(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Human("Sanyi", 119));
        assertEquals("A nev minimumm 2 tagu kell hogy legyen!",exception.getMessage());


    }
}